package top.catfish.test2_shiro.mapper;


import org.apache.ibatis.annotations.Mapper;
import top.catfish.test2_shiro.model.Role;
import top.catfish.test2_shiro.model.UserRoleKey;

import java.util.List;

public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);
    
    List<Role> selectByUserId(String id);
}