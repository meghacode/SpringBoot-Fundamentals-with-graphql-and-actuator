package hello;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    private UserRepository userRepository;

    public Query(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> findAllUser() {
        return userRepository.findAll();
    }

    public long countUser() {
        return userRepository.count();

    }
}
