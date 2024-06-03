package com.amine.spotifycloneback.catalogcontext.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
@Entity
@Data
@Table(name = "song_content")
public class SongContent implements Serializable {
    @Id
    @Column(name = "song_id")
    private Long songId;

    @MapsId
    @OneToOne
    @JoinColumn(name = "song_id", referencedColumnName = "id")
    private Song song;

    @Lob
    @Column(name = "file", nullable = false)
    private byte[] file;

    @Column(name = "file_content_type")
    private String fileContentType;
}
