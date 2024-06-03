package com.amine.spotifycloneback.catalogcontext.repository;

import com.amine.spotifycloneback.catalogcontext.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {

}
