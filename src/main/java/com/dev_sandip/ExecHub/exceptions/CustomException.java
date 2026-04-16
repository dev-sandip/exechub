package com.dev_sandip.ExecHub.exceptions;

public class CustomException extends RuntimeException {

    private final ErrorCode errorCode;

    public CustomException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
//way to send error
//if (userExists(userDTO.getUsername())) {
//        throw new CustomException(ErrorCode.INVALID_INPUT);
//        }