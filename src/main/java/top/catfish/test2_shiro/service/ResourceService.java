package top.catfish.test2_shiro.service;

import top.catfish.test2_shiro.model.Resource;

import java.util.List;
import java.util.Map;


public interface ResourceService {
    public List<Resource> loadUserResources(Map<String, Object> map);
}
