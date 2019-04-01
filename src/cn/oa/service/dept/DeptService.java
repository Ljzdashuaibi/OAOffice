package cn.oa.service.dept;

import java.util.List;

import cn.oa.pojo.Dept;

public interface DeptService {
	 public List<Dept> getDeptList();
	 public boolean addDept(Dept dept);
}
