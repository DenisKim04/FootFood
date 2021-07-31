package kg.FootFood.FootFood.mapper;

import kg.FootFood.FootFood.models.dto.FoodDto;
import kg.FootFood.FootFood.models.food.Food;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FoodMapper {
    FoodMapper INSTANCE = Mappers.getMapper(FoodMapper.class);
    //->
    FoodDto toDtoFromFood (Food food);
    List<FoodDto> listToDtoFromFood (List<Food> foodList);
    //<-
    Food toFoodFromDto (FoodDto foodDto);
    List<Food> listToFoodFromDto (List<FoodDto> foodDtoList);
}
