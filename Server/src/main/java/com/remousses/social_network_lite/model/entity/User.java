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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String pseudo;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String country;

    @Column(name = "birth_date", nullable = false)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate birthDate;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private boolean active;

    @OneToMany
    @JoinTable(name = "friendship", joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "user_id_friendship") })
    private List<Friendship> friendships;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
