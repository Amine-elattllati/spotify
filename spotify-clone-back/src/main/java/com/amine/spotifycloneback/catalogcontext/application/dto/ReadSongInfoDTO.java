package com.amine.spotifycloneback.catalogcontext.application.dto;

import com.amine.spotifycloneback.catalogcontext.application.vo.SongAuthorVO;
import com.amine.spotifycloneback.catalogcontext.application.vo.SongTitleVO;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class ReadSongInfoDTO {

    private SongTitleVO title;
    private SongAuthorVO author;
    @NotNull
    private byte[] cover;
    @NotNull
    private String coverContentType;

    @NotNull
    private boolean isFavorite;

    @NotNull
    private UUID publicId;
}
