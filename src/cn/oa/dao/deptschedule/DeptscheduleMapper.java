package cn.oa.dao.deptschedule;

import java.util.List;

import cn.oa.pojo.Deptschedule;

public interface DeptscheduleMapper {
	
	
	//新增日程
	public int addschedule(Deptschedule deptschedule);
	
	//查询部门日程
	public List<Deptschedule> dulelist();
	

}
