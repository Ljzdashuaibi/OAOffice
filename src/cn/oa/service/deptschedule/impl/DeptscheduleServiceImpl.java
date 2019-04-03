package cn.oa.service.deptschedule.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.oa.dao.deptschedule.DeptscheduleMapper;
import cn.oa.pojo.Deptschedule;
import cn.oa.service.deptschedule.DeptscheduleService;

@Service
public class DeptscheduleServiceImpl implements DeptscheduleService{
	
	@Resource
	private DeptscheduleMapper deptscheduleMapper;

	public boolean addschedule(Deptschedule deptschedule) {
		boolean flag = false;
		int num =0;
		num=deptscheduleMapper.addschedule(deptschedule);
		if(num > 0){
			flag=true;
			System.out.println("add success!");
		}else{
			System.out.println("add failed!");
		}
		return flag;
	}

	
	//查询日程
	public List<Deptschedule> dilelist() {
		// TODO Auto-generated method stub
		List<Deptschedule> dilelists=deptscheduleMapper.dulelist();
		return dilelists;
	}

}
