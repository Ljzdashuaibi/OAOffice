package cn.oa.pojo;

import java.util.Date;

public class Dept {
     private Integer id;
     private String name;
     private String number;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	

}
