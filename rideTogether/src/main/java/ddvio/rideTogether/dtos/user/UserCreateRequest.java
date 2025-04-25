package ddvio.rideTogether.dtos.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserCreateRequest {
    private String name;
    private String email;
    private String gender;
//    private String school;
    private String password;
}
