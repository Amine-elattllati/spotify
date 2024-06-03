package com.amine.spotifycloneback.catalogcontext.repository;

import com.amine.spotifycloneback.catalogcontext.domain.Favorite;
import com.amine.spotifycloneback.catalogcontext.domain.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
}
