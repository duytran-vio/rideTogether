package ddvio.rideTogether.controllers;

import ddvio.rideTogether.dtos.user.UserCreateRequest;
import ddvio.rideTogether.dtos.user.UserDto;
import ddvio.rideTogether.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<Object> createUser(@Valid @RequestBody UserCreateRequest dto) {
        UserDto user = userService.createUser(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
