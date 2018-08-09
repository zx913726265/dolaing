package com.dolaing.modular.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dolaing.core.datascope.DataScope;
import com.dolaing.modular.system.dao.UserMapper;
import com.dolaing.modular.system.model.User;
import com.dolaing.modular.system.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author zx
 * @since 2018-02-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public int setStatus(Integer userId, int status) {
        return this.baseMapper.setStatus(userId, status);
    }

    @Override
    public int changePwd(Integer userId, String pwd) {
        return this.baseMapper.changePwd(userId, pwd);
    }

    @Override
    public List<Map<String, Object>> selectUsers(DataScope dataScope, String name, String beginTime, String endTime, String type) {
        return this.baseMapper.selectUsers(dataScope, name, beginTime, endTime, type);
    }

    @Override
    public int setRoles(Integer userId, String roleIds) {
        return this.baseMapper.setRoles(userId, roleIds);
    }

    @Override
    public User getByAccount(String account) {
        return this.baseMapper.getByAccount(account);
    }

    @Override
    public List<User> getFarmerByParentAccount(String account) {
        return this.baseMapper.getFarmerByParentAccount(account);
    }

    @Override
    public User getUserByUserName(String condition) {
        return this.baseMapper.getUserByUserName(condition);
    }
}
