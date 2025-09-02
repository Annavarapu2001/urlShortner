package com.neueda.kgs.controller.dto;

import com.neueda.kgs.model.embedded.BrowserStats;
import com.neueda.kgs.model.embedded.OsStat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = true)
public class VisitStateDto extends BaseResponse {

    private LocalDate lastAccessDate;
    private Double dailyAverage;
    private Long max;
    private Long min;
    private Long totalPerYear;
    private Map<String, Long> perMonth;
    private BrowserStats byBrowsers;
    private OsStat byOs;
}
