package Computer.Shop.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "User")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @Column(name = "username", length = 20, nullable = false, unique = true)
    private String username;

    @Column(name = "password", length = 72, nullable = false)
    private String password;

    @Column(name = "email", length = 50, nullable = false, unique = true)
    private String email;
}

