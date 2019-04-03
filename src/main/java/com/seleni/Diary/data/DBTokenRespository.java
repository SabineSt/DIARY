package com.seleni.Diary.data;

import com.seleni.Diary.logic.security.InvalidTokenException;
import com.seleni.Diary.logic.security.Token;
import com.seleni.Diary.logic.security.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class DBTokenRespository implements TokenRepository {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public Token checkToken(String email) {
        Token lookedForToken;
        String query = "SELECT token from TOKENS where email = :email";
        MapSqlParameterSource sqlParameterSource = new MapSqlParameterSource();
        sqlParameterSource.addValue("email", email);
        try {
            lookedForToken = jdbcTemplate.queryForObject(query, sqlParameterSource, Token.class);
        } catch (DataAccessException e) {
            throw new InvalidTokenException("Invalid Token", e);
        } return lookedForToken;
    }
}

//boolean? od zuerst holen und dann