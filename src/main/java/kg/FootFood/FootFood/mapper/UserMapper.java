package kg.FootFood.FootFood.mapper;

import kg.FootFood.FootFood.models.dto.UserDto;
import kg.FootFood.FootFood.models.user.User;
import org.mapstruct.factory.Mappers;

import javax.persistence.Entity;
import java.util.List;

@Entity
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    // Перевод в в Dto
    UserDto toDtoFromUser(User user);
    List<UserDto> toDtoFromUser(List<User> userList);
    // Перевод обратно в User
    User toUserFromDto(UserDto userDto);
    List<User> listToUserFromDto(List<UserDto> userDtoList);


}
