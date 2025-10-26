package ddvio.rideTogether.services.impls;

import ddvio.rideTogether.data.entities.User;
import ddvio.rideTogether.data.entities.UserProfile;
import ddvio.rideTogether.data.repositories.UserRepository;
import ddvio.rideTogether.dtos.user.UserCreateRequest;
import ddvio.rideTogether.dtos.user.UserDto;
import ddvio.rideTogether.mappers.UserMapper;
import ddvio.rideTogether.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDto createUser (UserCreateRequest request){
        Pair<User, UserProfile> pair = userMapper.toUserAndProfile(request);
        User user = pair.getFirst();
        user = userRepository.save(user);
        return userMapper.toDto(user, user.getProfile());
    }
}
