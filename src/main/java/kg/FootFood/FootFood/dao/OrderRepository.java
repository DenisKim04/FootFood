package kg.FootFood.FootFood.dao;

import kg.FootFood.FootFood.models.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
