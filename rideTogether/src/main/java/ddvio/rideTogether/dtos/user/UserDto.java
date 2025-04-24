package ddvio.rideTogether.dtos.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserDto {
    private String name;
    private String email;
    private String gender;
    private String school;
}
