package com.example.springdatajpa.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="user3")
@NoArgsConstructor
@Setter
@Getter
@ToString
public class User {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(length = 255)
    private String email;

    @Column(length = 50)
    private String name;

    @Column(length = 500)
    private String password;

    @CreationTimestamp
    private LocalDateTime regdate;
}
