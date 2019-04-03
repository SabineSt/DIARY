package com.seleni.Diary.logic.security;

public interface TokenRepository {

    Token checkToken(String email);
}
