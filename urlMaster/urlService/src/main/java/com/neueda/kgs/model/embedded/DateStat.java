package com.neueda.kgs.model.embedded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DateStat implements Serializable {
    private Integer dayOfYear;
    private Integer visits;

    public void incrementVisit() {
        visits++;
    }
}
