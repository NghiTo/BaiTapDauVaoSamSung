package Computer.Shop.Service;

import Computer.Shop.Dto.AccessoryDto;
import Computer.Shop.Form.AccessoryCreateForm;
import Computer.Shop.Form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService
{
    Page<AccessoryDto> findAll(Pageable pageable);

    AccessoryDto create(AccessoryCreateForm form);

    AccessoryDto update(AccessoryUpdateForm form, Long id);;

    void deleteById(Long id);
}
