package ddvio.rideTogether.mappers;

import ddvio.rideTogether.data.entities.User;
import ddvio.rideTogether.data.entities.UserProfile;
import ddvio.rideTogether.dtos.user.UserCreateRequest;
import ddvio.rideTogether.dtos.user.UserDto;
import org.mapstruct.Mapper;
import org.springframework.data.util.Pair;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserCreateRequest request);
    UserDto toDto(User user);
    UserProfile toUserProfile(UserCreateRequest request);

    default Pair <User, UserProfile> toUserAndProfile(UserCreateRequest request) {
        User user = toEntity(request);
        UserProfile userProfile = toUserProfile(request);

        user.setProfile(userProfile);
        userProfile.setUser(user);
        return Pair.of(user, userProfile);
    }

    default UserDto toDto(User user, UserProfile userProfile) {
        UserDto userDto = toDto(user);
        userDto.setGender(userProfile.getGender());
//        userDto.setSchool(userProfile.getSchool().getName());
        return userDto;
    }
}
