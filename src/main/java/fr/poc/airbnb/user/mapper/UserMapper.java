package fr.poc.airbnb.user.mapper;

import fr.poc.airbnb.user.application.dto.ReadUserDTO;
import fr.poc.airbnb.user.domain.Authority;
import fr.poc.airbnb.user.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }
}
