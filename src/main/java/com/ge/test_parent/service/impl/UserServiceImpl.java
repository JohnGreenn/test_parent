package com.ge.test_parent.service.impl;

import com.ge.test_parent.entity.User;
import com.ge.test_parent.mapper.UserMapper;
import com.ge.test_parent.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author glq
 * @since 2022-10-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
