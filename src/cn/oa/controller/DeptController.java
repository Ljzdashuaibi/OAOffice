package cn.oa.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import cn.oa.pojo.Dept;
import cn.oa.pojo.User;
import cn.oa.service.dept.DeptService;
import cn.oa.tools.Constants;

@Scope("prototype")
@Controller
public class DeptController {
	
	@Resource
	private DeptService deptService;
	
	@RequestMapping("/searchDept.html")
	public String getDeptList(Model model){
		List<Dept>deList=null;
		deList=deptService.getDeptList();
		model.addAttribute("deList",deList);
		return "searchDept";
	}
	
	
	
	@RequestMapping("/createDept.html")
	public String addDept(@ModelAttribute("dept") Dept dept){
		return "createDept";
	}
	
	
	@RequestMapping(value="/addsave.html",method=RequestMethod.POST)
	public String addDeptSave(Dept dept,HttpSession session,HttpServletRequest request){
		boolean flag=true;
		if(flag) {
			dept.setCreatedBy(((User)session.getAttribute(Constants.USER_SESSION)).getId());
			dept.setCreationDate(new Date());
			if (deptService.addDept(dept)) {
				return "redirect:/searchDept.html";
			}
		}
		return "createDept";
	}
}
