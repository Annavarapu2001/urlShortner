package com.neueda.kgs.controller.dto;

import lombok.Data;

@Data
public class ResolveLinkDto {
    private Integer workerId;
    private String shortUrl;
    private String browser;
    private String os;
}
