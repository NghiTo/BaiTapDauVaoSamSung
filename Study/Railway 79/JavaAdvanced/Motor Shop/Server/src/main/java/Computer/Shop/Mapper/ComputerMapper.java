package Computer.Shop.Mapper;

import Computer.Shop.Dto.ComputerDto;
import Computer.Shop.Entity.Computer;
import Computer.Shop.Form.ComputerCreateForm;
import Computer.Shop.Form.ComputerUpdateForm;

public class ComputerMapper
{
    public static Computer map(ComputerCreateForm form)
    {
        var computer = new Computer();
        var pk = new Computer.PrimaryKey();
        pk.setProductCode(form.getProductCode());
        pk.setRepairDate(form.getRepairDate());
        computer.setPk(pk);
        computer.setCustomerName(form.getCustomerName());
        computer.setCatalogs(form.getCatalogs());
        computer.setBrand(form.getBrand());
        return computer;
    }
    public static ComputerDto map(Computer computer)
    {
        var dto = new ComputerDto();
        var pk = computer.getPk();
        dto.setProductCode(pk.getProductCode());
        dto.setRepairDate(pk.getRepairDate());
        dto.setCustomerName(computer.getCustomerName());
        dto.setCatalogs(computer.getCatalogs());
        dto.setBrand(computer.getBrand());
        return dto;
    }
    public static void map(ComputerUpdateForm form, Computer computer)
    {
        computer.setCustomerName(form.getCustomerName());
        computer.setCatalogs(form.getCatalogs());
        computer.setBrand(form.getBrand());
    }
}
