package springboot.crudrestfulwebservice.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springboot.crudrestfulwebservice.user.domain.User;
import springboot.crudrestfulwebservice.user.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // URL:
    // http://localhost:8070/UserList
    @GetMapping(value = "/UserList", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public List<User> findAllUser() {
        return userService.findAll();
    }
}
