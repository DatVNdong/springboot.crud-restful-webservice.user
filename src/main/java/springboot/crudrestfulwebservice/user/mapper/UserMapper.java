package springboot.crudrestfulwebservice.user.mapper;

import java.util.List;

import springboot.crudrestfulwebservice.user.domain.User;

public interface UserMapper {

    List<User> findAll();
}
