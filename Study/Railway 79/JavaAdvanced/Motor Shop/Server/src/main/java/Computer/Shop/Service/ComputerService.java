package Computer.Shop.Service;

import Computer.Shop.Dto.ComputerDto;
import Computer.Shop.Entity.Computer;
import Computer.Shop.Form.ComputerCreateForm;
import Computer.Shop.Form.ComputerUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ComputerService
{
    Page<ComputerDto> findAll(Pageable pageable);

    ComputerDto create(ComputerCreateForm form);

    ComputerDto update(ComputerUpdateForm form);

    void deleteById(Computer.PrimaryKey id);
}
