package Computer.Shop.Service;

import Computer.Shop.Dto.UserDto;
import Computer.Shop.Form.UserCreateForm;

public interface UserService
{
    UserDto create(UserCreateForm form);
}
