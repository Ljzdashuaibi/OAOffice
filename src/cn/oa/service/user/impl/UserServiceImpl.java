package cn.oa.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.oa.dao.user.UserMapper;
import cn.oa.pojo.User;
import cn.oa.service.user.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	
	@Resource
	private UserMapper userMapper;
	
	
	public User login(String account, String password) {
		User user = null;
		user =userMapper.getLoginUser(account);
	    if (null != user) {
			if (!user.getPassword().equals(password)) {
				user=null;
			}
		}
		return user;
	}
	
	public List<User> getUserList() {
		List<User> userList = null;
		userList=userMapper.getUserList();
		return userList;
	}
	public User getUserById(Integer id) {
		User user=null;
		try {
			user=userMapper.getUserById(id);
		} catch (Exception e) {
			user=null;
		}
		return user;
	}
	public boolean modify(User user) {
		boolean flag=false;
		try {
			if (userMapper.modify(user)>0) 
				flag=true;
		} catch (Exception e) {
			
		}
		return flag;
	}
	

}
