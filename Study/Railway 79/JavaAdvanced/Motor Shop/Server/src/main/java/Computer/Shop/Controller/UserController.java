package Computer.Shop.Controller;

import Computer.Shop.Dto.UserDto;
import Computer.Shop.Form.UserCreateForm;
import Computer.Shop.Service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@AllArgsConstructor
@CrossOrigin("http://127.0.0.1:5500")
public class UserController
{
    private final UserService userService;
    @PostMapping("/api/v1/users")
    public UserDto create(@RequestBody @Valid UserCreateForm form)
    {
        return userService.create(form);
    }
}
