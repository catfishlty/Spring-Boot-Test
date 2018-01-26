package top.catfish.test2_shiro.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.catfish.test2_shiro.model.Resource;
import top.catfish.test2_shiro.model.RoleResourceKey;

import java.util.List;

public interface RoleResourceMapper {
    int deleteByPrimaryKey(RoleResourceKey key);

    int insert(RoleResourceKey record);

    int insertSelective(RoleResourceKey record);

    List<Resource> selectByRoleId(String roleId);
}