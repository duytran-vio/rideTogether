package ddvio.rideTogether.services.impls;

import ddvio.rideTogether.data.entities.User;
import ddvio.rideTogether.data.repositories.UserRepository;
import ddvio.rideTogether.dtos.user.UserCreateRequest;
import ddvio.rideTogether.dtos.user.UserDto;
import ddvio.rideTogether.mappers.UserMapper;
import ddvio.rideTogether.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto createUser (UserCreateRequest request){
        User user = userMapper.toEntity(request);
        user = userRepository.save(user);
        return userMapper.toDto(user);
    }
}
