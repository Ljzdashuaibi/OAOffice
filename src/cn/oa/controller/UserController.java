package cn.oa.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.oa.pojo.User;
import cn.oa.service.user.UserService;
import cn.oa.tools.Constants;

@Scope("prototype")
@Controller
public class UserController {
	
	
	@RequestMapping("/login.html")
	public String login() {
			return "login";
	}
	
	@Resource
	private UserService userBiz;
	@RequestMapping("/")//登录
	public String  UserLogin(String account,String password,HttpSession session,HttpServletRequest request) {
		User user=userBiz.login(account, password);
		 if(null != user){
				session.setAttribute(Constants.USER_SESSION, user);
				return "redirect:/index.html";
			}else{
				request.setAttribute("error", "用户名或密码不正确");
				return "login";
			}
	 }
	@RequestMapping("/index.html")
	public String frame(HttpSession session) {
		if (session.getAttribute(Constants.USER_SESSION)==null) {
			return "redirect:/login.html";
		}
		    return "index";
	}
	@RequestMapping("/searchUser.html")
	public String getUserList(Model model){
		    List<User> userList = null;
			userList = userBiz.getUserList();
			model.addAttribute("userList", userList);
			return "SearchUser";
		}
	//修改用户信息
	@RequestMapping(value="/updateUser.html")
	public String getUserById(Integer uid,Model model){
		System.out.print(""+uid);
		User user=userBiz.getUserById(uid);
		model.addAttribute("user",user);
		return "updateUser";
	}
	
	@RequestMapping(value="/editUser.html")
	public String modifyUserSave(User user,HttpSession session){
		user.setModifyBy(((User)session.getAttribute(Constants.USER_SESSION)).getId());
		user.setModifyDate(new Date());
		if (userBiz.modify(user)) {
			return "redirect:/searchUser.html";
		}
		return "updateUser";
	}
}
