package com.neueda.kgs.model.embedded;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class Stats implements Serializable {
    private BrowserStats browserStats;
    private OsStat osStat;
    private List<DateStat> dateStats = new ArrayList<>();
}
