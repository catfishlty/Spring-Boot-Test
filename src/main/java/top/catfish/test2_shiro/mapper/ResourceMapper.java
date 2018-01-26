package top.catfish.test2_shiro.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.catfish.test2_shiro.model.Resource;

public interface ResourceMapper {
    int deleteByPrimaryKey(String id);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}