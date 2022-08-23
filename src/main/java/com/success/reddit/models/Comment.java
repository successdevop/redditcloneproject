package com.success.reddit.models;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Audible{
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String commentBody;

    @ManyToOne
    private Link link;
}
