package Computer.Shop.Service;

import Computer.Shop.Dto.AccessoryDto;
import Computer.Shop.Entity.Computer;
import Computer.Shop.Form.AccessoryCreateForm;
import Computer.Shop.Form.AccessoryUpdateForm;
import Computer.Shop.Mapper.AccessoryMapper;
import Computer.Shop.Repository.AccessoryRepository;
import Computer.Shop.Repository.ComputerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccessoryServiceImpl implements AccessoryService
{
    private final AccessoryRepository accessoryRepository;
    private final ComputerRepository computerRepository;
    @Override
    public Page<AccessoryDto> findAll(Pageable pageable)
    {
        return accessoryRepository.findAll(pageable).map(AccessoryMapper::map);
    }
    @Override
    public AccessoryDto create(AccessoryCreateForm form)
    {
        var accessory = AccessoryMapper.map(form);
        var pk = new Computer.PrimaryKey();
        pk.setProductCode(form.getProductCode());
        pk.setRepairDate(form.getRepairDate());
        var computer = computerRepository.findById(pk).get();
        accessory.setComputer(computer);
        var savedAccessory = accessoryRepository.save(accessory);
        return AccessoryMapper.map(savedAccessory);
    }
    @Override
    public AccessoryDto update(AccessoryUpdateForm form, Long id)
    {
        var accessory = accessoryRepository.findById(id).get();
        AccessoryMapper.map(form, accessory);
        var savedAccessory = accessoryRepository.save(accessory);
        return AccessoryMapper.map(savedAccessory);
    }
    @Override
    public void deleteById(Long id)
    {
        accessoryRepository.deleteById(id);
    }
}
