package com.hellokoding.account.repository;
package com.hellokoding2.account.repository:
import com.hellokoding.account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
