package kg.FootFood.FootFood.dao;

import kg.FootFood.FootFood.models.user.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,Long> {
}
