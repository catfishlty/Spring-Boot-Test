package top.catfish.test2_shiro.dao.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.catfish.test2_shiro.dao.UserRoleDao;
import top.catfish.test2_shiro.mapper.UserRoleMapper;

@Repository
public class UserRoleDaoImpl implements UserRoleDao{
    @Autowired
    private UserRoleMapper userRoleMapper;

}
