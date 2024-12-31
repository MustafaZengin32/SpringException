package com.mustafazengin.handler;

import lombok.Data;


public class ApiError<E> {

    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public Exception<E> getException() {
        return exception;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setException(Exception<E> exception) {
        this.exception = exception;
    }

    private Exception<E> exception;

}
