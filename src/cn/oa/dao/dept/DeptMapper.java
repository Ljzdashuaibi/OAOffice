package cn.oa.dao.dept;

import java.util.List;



import cn.oa.pojo.Dept;

public interface DeptMapper {
   
	
	public List<Dept> getDeptList();
	
	public int addDept(Dept dept);
	
	
	
}
