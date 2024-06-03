package com.amine.spotifycloneback.usercontext.domain;

import com.amine.spotifycloneback.sharedkernel.domain.AbstractAuditingEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "spotify_user")
public class User extends AbstractAuditingEntity<Long> {

    @Getter
    @Setter
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

}
