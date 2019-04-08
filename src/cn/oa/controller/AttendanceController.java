package cn.oa.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.oa.pojo.Attendance;
import cn.oa.service.attendance.AttendanceService;

@Controller
public class AttendanceController {
	
	@Resource
	private AttendanceService attendanceService;
	
	@RequestMapping(value="searchAttendance")
	public String attlisty(Model model){
		List<Attendance> list=attendanceService.attendancelist();
		model.addAttribute("attendances" ,list);
		
		
		return "searchAttendance";
	}
	
	
	
	
	

}
