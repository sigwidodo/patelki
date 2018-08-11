package com.patelki.domain;

import java.util.Date;

public class TnPUserLogin {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tn_p_user_login.user_login_id
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	private Integer userLoginId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tn_p_user_login.user_id
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	private String userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tn_p_user_login.password
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tn_p_user_login.role_id
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	private Integer roleId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tn_p_user_login.created_by
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	private Integer createdBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tn_p_user_login.created_date
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	private Date createdDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tn_p_user_login.user_login_id
	 * @return  the value of tn_p_user_login.user_login_id
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public Integer getUserLoginId() {
		return userLoginId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tn_p_user_login.user_login_id
	 * @param userLoginId  the value for tn_p_user_login.user_login_id
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public void setUserLoginId(Integer userLoginId) {
		this.userLoginId = userLoginId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tn_p_user_login.user_id
	 * @return  the value of tn_p_user_login.user_id
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tn_p_user_login.user_id
	 * @param userId  the value for tn_p_user_login.user_id
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public void setUserId(String userId) {
		this.userId = userId == null ? null : userId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tn_p_user_login.password
	 * @return  the value of tn_p_user_login.password
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tn_p_user_login.password
	 * @param password  the value for tn_p_user_login.password
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tn_p_user_login.role_id
	 * @return  the value of tn_p_user_login.role_id
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public Integer getRoleId() {
		return roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tn_p_user_login.role_id
	 * @param roleId  the value for tn_p_user_login.role_id
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tn_p_user_login.created_by
	 * @return  the value of tn_p_user_login.created_by
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tn_p_user_login.created_by
	 * @param createdBy  the value for tn_p_user_login.created_by
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tn_p_user_login.created_date
	 * @return  the value of tn_p_user_login.created_date
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tn_p_user_login.created_date
	 * @param createdDate  the value for tn_p_user_login.created_date
	 * @mbg.generated  Sat Aug 11 21:14:01 WIB 2018
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}