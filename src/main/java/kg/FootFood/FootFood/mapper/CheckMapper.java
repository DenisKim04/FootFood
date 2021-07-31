package kg.FootFood.FootFood.mapper;

import kg.FootFood.FootFood.models.dto.CheckDto;
import kg.FootFood.FootFood.models.order.Check;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CheckMapper {
    CheckMapper INSTANCE = Mappers.getMapper(CheckMapper.class);
    //->
    CheckDto toDtoFromCheck (Check check);
    List<CheckDto> listToDtoFromCheck (List<Check> checkList);
    //<-
    Check toCheckFromDto (CheckDto checkDto);
    List<Check> listToCheckFromDto (List<CheckDto> checkDtoList);
}
