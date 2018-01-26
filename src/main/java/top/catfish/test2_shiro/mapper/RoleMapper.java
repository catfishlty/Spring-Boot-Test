package top.catfish.test2_shiro.mapper;


import org.apache.ibatis.annotations.Mapper;
import top.catfish.test2_shiro.model.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}