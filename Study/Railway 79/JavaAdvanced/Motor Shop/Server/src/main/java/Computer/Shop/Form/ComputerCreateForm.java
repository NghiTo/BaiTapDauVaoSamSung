package Computer.Shop.Form;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ComputerCreateForm
{
    private String productCode;

    private LocalDate repairDate;

    private String customerName;

    private String catalogs;

    private String brand;
}
