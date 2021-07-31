package kg.FootFood.FootFood.models.dto;


import java.util.Date;

public class OrderDto {
    private Long id;
    private boolean status;
    private Date dateOrder;
    private UserDto user;
    private CheckDto check;
    private AddressDto address;
}
