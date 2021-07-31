package kg.FootFood.FootFood.mapper;

import kg.FootFood.FootFood.models.dto.PriceDto;
import kg.FootFood.FootFood.models.food.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
    //->
    PriceDto toDtoFromPrice (Price price);
    List<PriceDto> listToDtoFromPrice (List<Price> priceList);
    //<-
    Price toPriceFromDto (PriceDto priceDto);
    List<Price> listToPriceFromDto (List<PriceDto> priceDtoList);
}
