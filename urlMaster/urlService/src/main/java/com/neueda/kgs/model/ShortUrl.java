package com.neueda.kgs.model;

import com.neueda.kgs.model.embedded.Stats;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "shorturl")
public class ShortUrl implements Serializable {

    private static final long serialVersionUID = 6529685098267757690L;

    @Id
    private String id;

    @Indexed
    private Long keyCode;

    private LocalDate createdDate;
    private LocalDate lastAccessDate;

    @Indexed
    private String longUrl;

    private Stats stats;


    public ShortUrl(Long keyCode) {
        this.keyCode = keyCode;
    }
}
