package kg.FootFood.FootFood.mapper;

import kg.FootFood.FootFood.models.dto.OrderDto;
import kg.FootFood.FootFood.models.order.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    //->
    OrderDto toDtoFromOrder (Order order);
    List<OrderDto> listToDtoOrder (List<Order> orderList);
    //<-
    Order toOrderFromDto(OrderDto orderDto);
    List<Order> listToOrderFromDto(List<OrderDto> orderDtoList);
}
