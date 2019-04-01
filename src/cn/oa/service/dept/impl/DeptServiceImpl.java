package cn.oa.service.dept.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.oa.dao.dept.DeptMapper;
import cn.oa.pojo.Dept;
import cn.oa.service.dept.DeptService;
@Service
public class DeptServiceImpl implements DeptService {
@Resource
private DeptMapper deptMapper;
	public List<Dept> getDeptList() {
		List<Dept>deList=null;
		deList=deptMapper.getDeptList();
		return deList;
	}
	public boolean addDept(Dept dept) {
		boolean flag = false;
		int updateRows =0;
		try {
			 updateRows = deptMapper.addDept(dept);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(updateRows > 0){
			flag = true;
			System.out.println("add success!");
		}else{
			System.out.println("add failed!");
		}
		return flag;
	}

}
