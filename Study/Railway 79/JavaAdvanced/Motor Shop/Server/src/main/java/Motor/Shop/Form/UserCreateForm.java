package Motor.Shop.Form;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class UserCreateForm
{
    @NotBlank
    @Length(max = 50)
    private String name;

    @NotBlank
    @Length(max = 20)
    private String username;

    @NotBlank
    @Length(max = 50)
    private String email;

    @NotBlank
    @Length(max = 16, min = 8)
    private String password;
}

