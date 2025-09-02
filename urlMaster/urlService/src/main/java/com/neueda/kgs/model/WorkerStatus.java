package com.neueda.kgs.model;

import com.neueda.kgs.model.embedded.AllocatedCounter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "worker_status")
public class WorkerStatus {

    @Id
    private String id;

    private String workerId;

    private List<AllocatedCounter> allocatedRanges = new ArrayList<>();
    public WorkerStatus(String workerId) {
        this.workerId = workerId;
    }
}
