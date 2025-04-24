package ddvio.rideTogether.mappers;

import ddvio.rideTogether.data.entities.User;
import ddvio.rideTogether.dtos.user.UserCreateRequest;
import ddvio.rideTogether.dtos.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserCreateRequest request);

    UserDto toDto(User user);
}
