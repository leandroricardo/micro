package com.example.micro.user.model;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Tolerate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Builder
@Getter
public class User {

    @Id
    @GeneratedValue
    private long id;

    @Column
    @NotNull
    @Size(min = 3, max = 50)
    private String name;

    @Tolerate
    public User() {
    }
}
