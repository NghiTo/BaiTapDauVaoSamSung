package Computer.Shop.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "Accessory")
public class Accessory
{
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @Column(name = "Price", nullable = false)
    private Long price;

    @Column(name = "Status_damaged", nullable = false)
    private String statusDamaged;

    @Column(name = "Repair_status", nullable = false)
    private String repairStatus;

    @ManyToOne
    @JoinColumns(value =
            {
                    @JoinColumn(name = "Product_code", referencedColumnName = "Product_code", nullable = false),
                    @JoinColumn(name = "Repair_date", referencedColumnName = "Repair_date", nullable = false)
            })
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Computer computer;
}

