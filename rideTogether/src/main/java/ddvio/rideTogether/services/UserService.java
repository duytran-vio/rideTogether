package ddvio.rideTogether.services;

import ddvio.rideTogether.dtos.user.UserCreateRequest;
import ddvio.rideTogether.dtos.user.UserDto;

public interface UserService {
    UserDto createUser(UserCreateRequest request);
}
