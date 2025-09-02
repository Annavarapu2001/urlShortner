package com.neueda.kgs.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "range_partition_status")
@Data
public class AllocatedRangePartitionStatus {

    @Id
    private String id;

    private Integer allocatedPartitionNumber = 0;

    @Version
    private Integer version;

    public void incrementAllocatedPartitionNumber() {
        allocatedPartitionNumber++;
    }
}
