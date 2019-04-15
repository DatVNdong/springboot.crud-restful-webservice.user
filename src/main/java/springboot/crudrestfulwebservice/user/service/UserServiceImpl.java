package springboot.crudrestfulwebservice.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.crudrestfulwebservice.user.domain.User;
import springboot.crudrestfulwebservice.user.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        list.addAll(getListUserMap());
        return list;
    }

    private Collection<User> getListUserMap() {
        Map<Integer, User> userMap = new HashMap<>();
        List<User> list = userMapper.findAll();
        for (User user : list) {
            userMap.put(user.getId(), user);
        }
        return userMap.values();
    }
}
