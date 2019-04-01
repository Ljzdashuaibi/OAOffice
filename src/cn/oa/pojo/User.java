package cn.oa.pojo;

import java.util.Date;

public class User {
	private Integer id;
    private String account;//登录名
    private String password;
    private double wages;//薪水
    private String number;//员工编号
    private String name;
    private Integer deptId;//所属部门
    private String deptName;
    private Integer roleId;
    private Integer gender;
    private String telphone;
    private String address;
    private String card;
    private Integer nationalId;
    private Integer educationId;
    private String institute;
    private String major;
    private Integer projectId; 
    private Integer modifyBy;
    private Date modifyDate;

    public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public String getDeptName() {
			return deptName;
		}
	public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public Integer getNationalId() {
		return nationalId;
	}
	public void setNationalId(Integer nationalId) {
		this.nationalId = nationalId;
	}
	public Integer getEducationId() {
		return educationId;
	}
	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	  
} 
