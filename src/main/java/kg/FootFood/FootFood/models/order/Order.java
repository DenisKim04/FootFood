package kg.FootFood.FootFood.models.order;

import kg.FootFood.FootFood.models.Address;
import kg.FootFood.FootFood.models.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Order {
    private Long id;
    private boolean status;
    @Column(name = "date_order")
    private Date dateOrder;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "check_id")
    private Check check;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

}
