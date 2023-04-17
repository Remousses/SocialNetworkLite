package com.remousses.social_network_lite.model.entity;

import com.remousses.social_network_lite.model.entity.converter.LocalDateConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "pseudo", nullable = false)
    private String pseudo;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "birth_date", nullable = false)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate birthDate;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "active", nullable = false)
    private boolean active;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
