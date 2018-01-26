package top.catfish.test2_shiro.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.catfish.test2_shiro.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    User selectByUsername(String username);

    int selectCountByUsernameAndPassword(String username,String password);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}