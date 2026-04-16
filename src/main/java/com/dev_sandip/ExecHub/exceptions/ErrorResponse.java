package com.dev_sandip.ExecHub.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class ErrorResponse {

    private String errorCode;
    private String errorMessage;
    @Setter
    private Map<String, List<String>> validationErrors;

    public ErrorResponse(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}
