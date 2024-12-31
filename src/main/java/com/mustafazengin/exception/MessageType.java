package com.mustafazengin.exception;

import lombok.Getter;

@Getter
public enum MessageType {

    NO_RECORD_EXIST("10001", "Kayit Bulunamadi"),
    GENERAL_EXCEPTION("9999", "Genel Hata");

    private final String code;
    private final String message;

    // Explicitly define getter if necessary (though Lombok's @Getter should work)
    public String getMessage() {
        return message;
    }

    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }
}
