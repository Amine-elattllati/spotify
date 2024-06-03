package com.amine.spotifycloneback.catalogcontext.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;
@Data
public class FavoriteId implements Serializable {
    UUID songPublicId;

    String userEmail;

}
