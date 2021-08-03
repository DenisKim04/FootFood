package kg.FootFood.FootFood.dao;

import kg.FootFood.FootFood.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
