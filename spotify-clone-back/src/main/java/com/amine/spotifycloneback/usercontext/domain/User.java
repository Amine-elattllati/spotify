package com.amine.spotifycloneback.usercontext.domain;

import jakarta.persistence.*;
@Entity
@Table(name = "spotify_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "userSequenceGenerator")
    @SequenceGenerator(name = "userSequenceGenerator",sequenceName = "user_generator",allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "email")
    private String email;

    private Subscription subscription = Subscription.FREE;

    @Column(name = "image_url")
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
