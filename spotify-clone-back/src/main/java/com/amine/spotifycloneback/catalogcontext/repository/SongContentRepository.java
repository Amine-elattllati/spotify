package com.amine.spotifycloneback.catalogcontext.repository;

import com.amine.spotifycloneback.catalogcontext.domain.SongContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongContentRepository extends JpaRepository<SongContent,Long> {
}
