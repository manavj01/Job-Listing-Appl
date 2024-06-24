package com.manav.JobListing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "JobListing")
public class Post {
    private String profile;
    private String desc;
    private int exp;
    private String[] techs;
}
