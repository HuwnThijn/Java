package demo.ThaiHungThinh.KT.repository;


import demo.ThaiHungThinh.KT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
}
