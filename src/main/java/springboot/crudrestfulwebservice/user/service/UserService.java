package springboot.crudrestfulwebservice.user.service;

import java.util.List;

import springboot.crudrestfulwebservice.user.domain.User;

public interface UserService {

    List<User> findAll();
}
