package com.elociny.forum.hub.infra;

public class DuplicateTopicException extends RuntimeException{
    public DuplicateTopicException(String mensagem) {
        super(mensagem);
    }
}
