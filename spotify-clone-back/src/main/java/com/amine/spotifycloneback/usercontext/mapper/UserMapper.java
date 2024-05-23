package com.amine.spotifycloneback.usercontext.mapper;

import com.amine.spotifycloneback.usercontext.ReadUserDTO;
import com.amine.spotifycloneback.usercontext.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User entity);
}
