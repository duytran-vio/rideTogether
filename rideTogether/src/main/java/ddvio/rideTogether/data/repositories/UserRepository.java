package ddvio.rideTogether.data.repositories;

import ddvio.rideTogether.data.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
