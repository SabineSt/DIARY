package com.seleni.Diary.logic.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenService {

    @Autowired
    private TokenRepository tokenRepository;

    public Token checkToken(String email) {
        return tokenRepository.checkToken(email);
        //userpasswordparamter?
    }
}
