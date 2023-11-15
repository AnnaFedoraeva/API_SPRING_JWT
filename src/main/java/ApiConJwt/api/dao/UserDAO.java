package ApiConJwt.api.dao;

import ApiConJwt.api.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository <User, Integer> {


    User findByEmail(@Param("email") String email);

}