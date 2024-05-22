package com.amine.spotifycloneback.usercontext.repository;

import com.amine.spotifycloneback.usercontext.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
