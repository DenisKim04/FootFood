package kg.FootFood.FootFood.models.order;

import kg.FootFood.FootFood.models.food.Food;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Checks")
@AllArgsConstructor
@RequiredArgsConstructor
public class Check {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date checkDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "food_id")
    private Food food;
}
