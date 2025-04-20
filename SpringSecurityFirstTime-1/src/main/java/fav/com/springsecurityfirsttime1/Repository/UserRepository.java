package fav.com.springsecurityfirsttime1.Repository;

import fav.com.springsecurityfirsttime1.Entitys.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity ,Integer> {
    Optional<UserEntity> findByUsername(String username);
}
