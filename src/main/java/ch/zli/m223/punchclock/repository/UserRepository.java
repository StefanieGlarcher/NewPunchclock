package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    //JPQL abfrage
    @Query("Select u From User u where u.username = ?1")
    User findByUsername(String username);
}
