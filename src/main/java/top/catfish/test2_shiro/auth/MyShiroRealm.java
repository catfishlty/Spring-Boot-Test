package top.catfish.test2_shiro.auth;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import top.catfish.test2_shiro.mapper.UserMapper;
import top.catfish.test2_shiro.model.Resource;
import top.catfish.test2_shiro.model.User;
import top.catfish.test2_shiro.service.Impl.ResourceServiceImlpl;
import top.catfish.test2_shiro.service.Impl.UserServiceImpl;
import top.catfish.test2_shiro.util.EncriptUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    ResourceServiceImlpl resourceService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userid",user.getId());
        List<Resource> resourcesList = resourceService.loadUserResources(map);
        // 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        for(Resource resource: resourcesList){
            info.addStringPermission(resource.getResourceUrl());
        }
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        String username = (String) authenticationToken.getPrincipal();
        String password = (String) authenticationToken.getCredentials();
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User user = userService.selectByUsername(username);
        System.out.println("Username : "+username);
        System.out.println("password : "+password);
        System.out.println("Password : "+user.getPass());
        if(password.equals(user.getPass())){
            return new SimpleAuthenticationInfo(username, password, getName());
        }else{
            System.out.println(password+"\n"+user.getPass()+"\n");
            throw new AuthenticationException();
        }
    }
}
