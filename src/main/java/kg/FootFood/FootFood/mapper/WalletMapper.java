package kg.FootFood.FootFood.mapper;

import kg.FootFood.FootFood.models.dto.WalletDto;
import kg.FootFood.FootFood.models.user.Wallet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface WalletMapper {
    WalletMapper INSTANCE = Mappers.getMapper(WalletMapper.class);
    //->
    WalletDto toDtoFormWallet (Wallet wallet);
    List<WalletDto> listToDtoFromWallet (List<Wallet> walletList);
    //<-
    Wallet toWalletFromDto (WalletDto walletDto);
    List<WalletDto> listToWalletFromDto (List<WalletDto> walletDtoList);
}
