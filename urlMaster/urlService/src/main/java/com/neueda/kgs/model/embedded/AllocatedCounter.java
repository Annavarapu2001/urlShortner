package com.neueda.kgs.model.embedded;

import lombok.Data;
import org.springframework.data.annotation.Version;

@Data
public class AllocatedCounter {

    private Integer rangeNumber;
    private Long counter;
    private Boolean isExhausted = false;

    @Version
    private Integer version;

    public void incrementCounter() {
        counter++;
    }
}
