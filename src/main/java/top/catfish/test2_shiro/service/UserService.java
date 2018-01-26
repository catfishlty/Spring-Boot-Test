package top.catfish.test2_shiro.service;

import top.catfish.test2_shiro.model.User;

public interface UserService {

    User selectByUsername(String username);

    int selectCountByUsernameAndPassword(String username,String password);
}
