package com.amine.spotifycloneback.catalogcontext.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Data
@Table(name = "song")
public class Song implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "songSequenceGenerator")
    @SequenceGenerator(name = "songSequenceGenerator",sequenceName = "song_generator",allocationSize = 1)
    @Column(name = "id")
    private Long id;

    @UuidGenerator
    @Column(name = "public_id", nullable = false)
    private UUID publicId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "cover", nullable = false)
    private String cover;

    @Column(name = "cover_content_type", nullable = false)
    private String coverContentType;


}
