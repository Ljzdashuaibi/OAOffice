package cn.oa.service.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.oa.pojo.User;
public interface UserService {
	//login
	  public User login(String account,String password); 
	  
	  public List<User> getUserList();
	  
	  public User getUserById(@Param("id")Integer id);
      public boolean modify(User user);
}
