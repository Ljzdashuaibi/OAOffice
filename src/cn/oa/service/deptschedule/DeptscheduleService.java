package cn.oa.service.deptschedule;

import java.util.List;

import cn.oa.pojo.Deptschedule;

public interface DeptscheduleService {
	
	//新增日程
	public boolean addschedule(Deptschedule deptschedule);
	
	//查询日程
	public List<Deptschedule> dilelist();

}
