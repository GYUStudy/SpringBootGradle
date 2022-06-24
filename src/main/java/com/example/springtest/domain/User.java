package com.example.springtest.domain;

import lombok.Getter;
import javax.persistence.*;


@Entity
@Table(name="user")
@Getter
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String userName;

    @Column(length = 50, nullable = false)
    private String passWord;
}
