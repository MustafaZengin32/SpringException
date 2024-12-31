package com.mustafazengin.handler;

import com.mustafazengin.exception.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {BaseException.class})
    public ResponseEntity<ApiError<Object>> handleBaseException(BaseException exception, WebRequest request) {
        return ResponseEntity.badRequest().body(createApiError(exception.getMessage(), request));
    }

    private String getHostname() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        return "UnknownHost";
    }

    public <E> ApiError<E> createApiError(String message, WebRequest request) {
        ApiError<E> apiError = new ApiError<>();
        apiError.setStatus(HttpStatus.BAD_REQUEST.value());

        Exception<E> customException = new Exception<>();
        customException.setCreateTime(new Date());
        customException.setHostName(getHostname());
        customException.setPath(request.getDescription(false));
        customException.setMessage((E) message);

        apiError.setException(customException);

        return apiError;
    }
}

