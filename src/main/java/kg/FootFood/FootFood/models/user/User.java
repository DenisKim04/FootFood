package kg.FootFood.FootFood.models.user;

import kg.FootFood.FootFood.models.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String emil;
    private String password;
    @Column(name = "phone_num")
    private String phoneNum;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wallets_id")
    private Wallet wallet;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    private boolean active;

}
