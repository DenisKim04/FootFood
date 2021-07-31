package kg.FootFood.FootFood.mapper;

import kg.FootFood.FootFood.models.Address;
import kg.FootFood.FootFood.models.dto.AddressDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AddressMapper {
    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);
    //->
    AddressDto toDtoFromAddress (Address address);
    List<AddressDto> listToDtoFromAddress (List<Address> addressList);
    //<-
    Address toAddressFromDto (AddressDto addressDto);
    List<Address> listToAddressFromDto (List<AddressDto> addressDtoList);
}
