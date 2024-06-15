package demo.ThaiHungThinh.KT.repository;


import demo.ThaiHungThinh.KT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
