package hello;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private UserRepository userRepository;

    public Mutation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User newUser(String name, Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userRepository.save(user);
        return user;
    }

    public boolean deleteUser(Integer id) {
        userRepository.deleteById(id);
        return true;
    }

}
