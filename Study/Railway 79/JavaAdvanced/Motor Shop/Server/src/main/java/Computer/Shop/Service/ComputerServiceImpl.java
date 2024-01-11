package Computer.Shop.Service;

import Computer.Shop.Entity.Computer;
import Computer.Shop.Form.ComputerUpdateForm;
import Computer.Shop.Repository.ComputerRepository;
import Computer.Shop.Dto.ComputerDto;
import Computer.Shop.Form.ComputerCreateForm;
import Computer.Shop.Mapper.ComputerMapper;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ComputerServiceImpl implements ComputerService
{
    private final ComputerRepository computerRepository;
    @Override
    public Page<ComputerDto> findAll(Pageable pageable)
    {
        return computerRepository.findAll(pageable).map(ComputerMapper::map);
    }

    @Override
    public ComputerDto create(ComputerCreateForm form)
    {
        var computer = ComputerMapper.map(form);
        var savedComputer = computerRepository.save(computer);
        return ComputerMapper.map(savedComputer);
    }

    @Override
    public ComputerDto update(ComputerUpdateForm form)
    {
        var pk = new Computer.PrimaryKey();
        pk.setProductCode(form.getProductCode());
        pk.setRepairDate(form.getRepairDate());
        var computer = computerRepository.findById(pk).get();
        ComputerMapper.map(form, computer);
        var savedComputer = computerRepository.save(computer);
        return ComputerMapper.map(savedComputer);
    }

    @Override
    public void deleteById(Computer.PrimaryKey id)
    {
        computerRepository.deleteById(id);
    }
}
