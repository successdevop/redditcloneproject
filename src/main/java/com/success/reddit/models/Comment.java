package com.success.reddit.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class Comment extends Audible{
    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String commentBody;

    @ManyToOne
    @NonNull
    private Link link;
}
