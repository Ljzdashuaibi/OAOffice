package cn.oa.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Attendance {
	private Integer id;
	private Integer userid;
	public String userName;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date recordDate;
	private Integer amount;
	private Integer leave;
	private Integer absenteeism;
	private Integer vacation;
	private Integer realAmount;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getLeave() {
		return leave;
	}
	public void setLeave(Integer leave) {
		this.leave = leave;
	}
	public Integer getAbsenteeism() {
		return absenteeism;
	}
	public void setAbsenteeism(Integer absenteeism) {
		this.absenteeism = absenteeism;
	}
	public Integer getVacation() {
		return vacation;
	}
	public void setVacation(Integer vacation) {
		this.vacation = vacation;
	}
	public Integer getRealAmount() {
		return realAmount;
	}
	public void setRealAmount(Integer realAmount) {
		this.realAmount = realAmount;
	}
	
	

}
