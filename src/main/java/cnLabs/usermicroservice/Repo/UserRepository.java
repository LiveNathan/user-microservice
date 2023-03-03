package cnLabs.usermicroservice.Repo;

import cnLabs.usermicroservice.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}