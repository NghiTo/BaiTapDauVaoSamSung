package Computer.Shop.Entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Computer")
public class Computer 
{
    @EmbeddedId
    private PrimaryKey pk;

    @Getter
    @Setter
    @EqualsAndHashCode
    @Embeddable
    public static class PrimaryKey
    {
        @Column(name = "Product_code", length = 10, nullable = false)
        private String productCode;

        @Column(name = "Repair_date", nullable = false)
        private LocalDate repairDate;
    }

    @Column(name = "Customer_name", nullable = false, length = 100)
    private String customerName;

    @Column(name = "Catalogs", nullable = false, length = 100)
    private String catalogs;

    @Column(name = "Brand", nullable = false, length = 20)
    private String brand;

    @OneToMany(mappedBy = "computer")
    private List<Accessory> accessories;
}


