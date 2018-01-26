package top.catfish.test2_shiro.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.catfish.test2_shiro.mapper.UserMapper;
import top.catfish.test2_shiro.model.User;
import top.catfish.test2_shiro.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }

    @Override
    public int selectCountByUsernameAndPassword(String username, String password) {

        return 0;
    }
}
