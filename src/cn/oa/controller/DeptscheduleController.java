package cn.oa.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import cn.oa.pojo.Dept;
import cn.oa.pojo.Deptschedule;
import cn.oa.pojo.User;
import cn.oa.service.dept.DeptService;
import cn.oa.service.deptschedule.DeptscheduleService;
import cn.oa.tools.Constants;


@Controller
public class DeptscheduleController {
	
	@Resource
	private DeptService deptService;
	
	@Resource
	private DeptscheduleService deptscheduleService;
	
	//新增部门日程
	@RequestMapping(value="createDeptSchedule.html")
	public String adddept(Model model){
		List<Dept> depts=deptService.getDeptList();
		model.addAttribute("depts" ,depts); 
		return "createDeptSchedule";
	}
							
	@RequestMapping(value="saveDeptSchedule.html",method=RequestMethod.POST)
	public String adddepts(Deptschedule deptschedule,HttpSession session,HttpServletRequest request){
		boolean flag=true;
		if(flag) {
			deptschedule.setCreatedBy(((User)session.getAttribute(Constants.USER_SESSION)).getId());
			deptschedule.setCreationDate(new Date());
			if(deptscheduleService.addschedule(deptschedule)){
				return "redirect:/searchDept.html";
			}
		}
		return "createDeptSchedule";
	}
	
	//查询部门列表
	@RequestMapping(value="searchDeptSchedule.html")
	public String updatedule(Model model,Deptschedule deptschedule){
		List<Deptschedule> list=deptscheduleService.dilelist();
		model.addAttribute("deptSchedules",list);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+list);
		return "searchDeptSchedule";
	}
}
