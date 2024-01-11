package Computer.Shop.Repository;

import Computer.Shop.Entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Computer.PrimaryKey>
{

}
