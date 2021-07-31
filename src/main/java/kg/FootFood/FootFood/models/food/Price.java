package kg.FootFood.FootFood.models.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "prices")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private BigDecimal money;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;


}
