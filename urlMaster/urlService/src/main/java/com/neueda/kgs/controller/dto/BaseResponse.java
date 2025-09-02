package com.neueda.kgs.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse {
    public static final int SUCCESSFUL = 0;
    public static final int RESOURCE_NOT_FOUND = 1;
    public static final int BAD_REQUEST = 2;
    public static final int INSUFFICIENT_KEY = 3;
    public static final int SERVER_TOO_BUSY = 4;

    private boolean success;
    private String message;
    private Integer code;
}
