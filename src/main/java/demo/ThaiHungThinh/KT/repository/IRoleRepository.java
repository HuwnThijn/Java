package demo.ThaiHungThinh.KT.repository;

import demo.ThaiHungThinh.KT.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findRoleById(Long id);
}
