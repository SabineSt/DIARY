package com.seleni.Diary.logic.security;

import org.springframework.dao.DataAccessException;

public class InvalidTokenException extends RuntimeException {
    public InvalidTokenException(String message, Throwable cause) {
        super(message, cause);
    }
}
