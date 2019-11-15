package org.daijie.springboot.orm.daijiejdbc.model;

import java.util.Date;
import javax.persistence.*;
import java.io.Serializable;

/**
 * 
 * @author shiji
 * @date 2019年11月14日
 */
@Table(name = "user")
public class User implements Serializable {

	/**
	 * 	
	 */
	@Id
	@Column(name = "user_id")
	public Integer userId;

	/**
	 * 	
	 */
	@Column(name = "salt")
	public String salt;

	/**
	 * 	
	 */
	@Column(name = "create_date")
	public Date createDate;

	/**
	 * 	
	 */
	@Column(name = "password")
	public String password;

	/**
	 * 	
	 */
	@Column(name = "user_name")
	public String userName;

	/**
	 * 	
	 */
	@Column(name = "remark")
	public String remark;

	/**
	 * 设置	
	 * @param salt	
	 */
	public void setSalt(String salt) {	
		this.salt = salt;	
	}

	/**
	 * 获取	
	 * @return salt	
	 */
	public String getSalt() {	
		return this.salt;	
	}

	/**
	 * 设置	
	 * @param createDate	
	 */
	public void setCreateDate(Date createDate) {	
		this.createDate = createDate;	
	}

	/**
	 * 获取	
	 * @return create_date	
	 */
	public Date getCreateDate() {	
		return this.createDate;	
	}

	/**
	 * 设置	
	 * @param password	
	 */
	public void setPassword(String password) {	
		this.password = password;	
	}

	/**
	 * 获取	
	 * @return password	
	 */
	public String getPassword() {	
		return this.password;	
	}

	/**
	 * 设置	
	 * @param userId	
	 */
	public void setUserId(Integer userId) {	
		this.userId = userId;	
	}

	/**
	 * 获取	
	 * @return user_id	
	 */
	public Integer getUserId() {	
		return this.userId;	
	}

	/**
	 * 设置	
	 * @param userName	
	 */
	public void setUserName(String userName) {	
		this.userName = userName;	
	}

	/**
	 * 获取	
	 * @return user_name	
	 */
	public String getUserName() {	
		return this.userName;	
	}

	/**
	 * 设置	
	 * @param remark	
	 */
	public void setRemark(String remark) {	
		this.remark = remark;	
	}

	/**
	 * 获取	
	 * @return remark	
	 */
	public String getRemark() {	
		return this.remark;	
	}

	@Override
	public int hashCode() {	
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
		result = prime * result + ((this.salt == null) ? 0 : this.salt.hashCode());
		result = prime * result + ((this.createDate == null) ? 0 : this.createDate.hashCode());
		result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
		result = prime * result + ((this.userName == null) ? 0 : this.userName.hashCode());
		result = prime * result + ((this.remark == null) ? 0 : this.remark.hashCode());
		return result;
	}

	@Override
	public String toString() {	
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", userId=").append(this.userId);
		sb.append(", salt=").append(this.salt);
		sb.append(", createDate=").append(this.createDate);
		sb.append(", password=").append(this.password);
		sb.append(", userName=").append(this.userName);
		sb.append(", remark=").append(this.remark);
		sb.append("]");
		return sb.toString();
	}

	@Override
	public boolean equals(Object that) {	
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		User other = (User) that;
		return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
			&& (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
			&& (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
			&& (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
			&& (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
			&& (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
	}

}