package cn.oa.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.oa.pojo.User;
public interface UserMapper {
     //login
	public User getLoginUser(@Param("account")String account);
	//员工列表
	public List<User> getUserList();
	//update
	public User getUserById(@Param("id")Integer id);
	public int modify(User user);
}
