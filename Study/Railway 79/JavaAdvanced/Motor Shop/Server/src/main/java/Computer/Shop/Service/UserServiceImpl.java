package Computer.Shop.Service;

import Computer.Shop.Mapper.UserMapper;
import Computer.Shop.Repository.UserRepository;
import Computer.Shop.Dto.UserDto;
import Computer.Shop.Form.UserCreateForm;
import lombok.AllArgsConstructor;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService
{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public UserDto create(UserCreateForm form)
    {
        var user = UserMapper.map(form);
        var encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        var savedUser = userRepository.save(user);
        return UserMapper.map(savedUser);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        var user = userRepository.findByUsername(username);
        if(user == null)
        {
            throw new UsernameNotFoundException(username);
        }
        return new User(user.getUsername(), user.getPassword(), AuthorityUtils.NO_AUTHORITIES);
    }
}
