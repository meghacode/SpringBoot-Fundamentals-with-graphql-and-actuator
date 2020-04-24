package hello;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import hello.User;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("select t.name from User t where t.id=id")
    String findByName(@Param("id") Integer id);

}