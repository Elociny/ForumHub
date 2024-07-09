package com.elociny.forum.hub.infra.exception;

public class DuplicateTopicException extends RuntimeException{
    public DuplicateTopicException(String mensagem) {
        super(mensagem);
    }
}
