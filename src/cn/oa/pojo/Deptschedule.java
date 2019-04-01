package cn.oa.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Deptschedule {
	
	private Integer id;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startdate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date enddate;
	private String position;
	private String content;
	private Integer deptid;
	
	
	private String deptName;
	
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	private Integer createdBy;
    private Date creationDate;
	
    public Integer getCreatedBy() {
   	 	return createdBy;
    }
    public void setCreatedBy(Integer createdBy) {
    	this.createdBy = createdBy;
    }
	 public Date getCreationDate() {
	 	return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	

}
