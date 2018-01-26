package top.catfish.test2_shiro.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import top.catfish.test2_shiro.mapper.ResourceMapper;
import top.catfish.test2_shiro.mapper.RoleResourceMapper;
import top.catfish.test2_shiro.mapper.UserRoleMapper;
import top.catfish.test2_shiro.model.Resource;
import top.catfish.test2_shiro.model.Role;
import top.catfish.test2_shiro.model.User;
import top.catfish.test2_shiro.service.ResourceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ResourceServiceImlpl implements ResourceService{

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RoleResourceMapper roleResourceMapper;

    @Override
    public List<Resource> loadUserResources(Map<String,Object> map){
        List<Resource> list = new ArrayList<>();
        String userId = (String) map.get("user_id");
        List<Role> roleList = userRoleMapper.selectByUserId(userId);
        for(Role role:roleList){
            List<Resource> resources = roleResourceMapper.selectByRoleId(role.getId());
            list.addAll(resources);
        }
        return list;
    }
}
