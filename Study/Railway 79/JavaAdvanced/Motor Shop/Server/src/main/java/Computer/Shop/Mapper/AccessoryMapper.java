package Computer.Shop.Mapper;

import Computer.Shop.Dto.AccessoryDto;
import Computer.Shop.Entity.Accessory;
import Computer.Shop.Form.AccessoryCreateForm;
import Computer.Shop.Form.AccessoryUpdateForm;

public class AccessoryMapper
{
    public static Accessory map(AccessoryCreateForm form)
    {
        var accessory = new Accessory();
        accessory.setName(form.getName());
        accessory.setPrice(form.getPrice());
        accessory.setStatusDamaged(form.getStatusDamaged());
        accessory.setRepairStatus(form.getRepairStatus());
        return accessory;
    }
    public static AccessoryDto map(Accessory accessory)
    {
        var dto = new AccessoryDto();
        dto.setId(accessory.getId());
        var pk = accessory.getComputer().getPk();
        dto.setProductCode(pk.getProductCode());
        dto.setRepairDate(pk.getRepairDate());
        dto.setName(accessory.getName());
        dto.setPrice(accessory.getPrice());
        dto.setStatusDamaged(accessory.getStatusDamaged());
        dto.setRepairStatus(accessory.getRepairStatus());
        return dto;
    }
    public static void map(AccessoryUpdateForm form, Accessory accessory)
    {
        accessory.setName(form.getName());
        accessory.setPrice(form.getPrice());
        accessory.setStatusDamaged(form.getStatusDamaged());
        accessory.setRepairStatus(form.getRepairStatus());
    }
}
