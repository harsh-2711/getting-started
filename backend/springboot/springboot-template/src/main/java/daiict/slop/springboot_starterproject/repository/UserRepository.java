package daiict.slop.springboot_starterproject.repository;

import daiict.slop.springboot_starterproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User Repository  - JPA INTERFACE .
 * @version 1.0
 * @since Oct 8, 2020
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByName(String userName);

    void deleteByName(String userName);
}
