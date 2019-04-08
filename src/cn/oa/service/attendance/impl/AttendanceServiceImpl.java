package cn.oa.service.attendance.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.oa.dao.attendance.AttendanceMapper;
import cn.oa.pojo.Attendance;
import cn.oa.service.attendance.AttendanceService;

@Service
public class AttendanceServiceImpl implements AttendanceService{

	
	@Resource
	private AttendanceMapper attendanceMapper;
	
	
	//考勤列表
	public List<Attendance> attendancelist() {
		List<Attendance> list=attendanceMapper.attendancelist();
		return list;
	}

}
