package kg.FootFood.FootFood.dao;

import kg.FootFood.FootFood.models.food.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price,Long> {
}
