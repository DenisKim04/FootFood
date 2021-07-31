package kg.FootFood.FootFood.models.food;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "prices")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Price {
    private  long id;
    private BigDecimal money;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "end_date")
    private Date endDate;


}
