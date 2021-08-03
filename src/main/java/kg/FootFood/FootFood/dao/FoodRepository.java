package kg.FootFood.FootFood.dao;

import kg.FootFood.FootFood.models.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> {
}
