package com.patelki.domain;

import java.util.Date;

public class TnMWorkingStatus {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tn_m_working_status.working_status_id
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	private Integer workingStatusId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tn_m_working_status.working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	private String workingStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tn_m_working_status.status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tn_m_working_status.created_by
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	private Integer createdBy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tn_m_working_status.created_date
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	private Date createdDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tn_m_working_status.working_status_id
	 * @return  the value of tn_m_working_status.working_status_id
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	public Integer getWorkingStatusId() {
		return workingStatusId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tn_m_working_status.working_status_id
	 * @param workingStatusId  the value for tn_m_working_status.working_status_id
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	public void setWorkingStatusId(Integer workingStatusId) {
		this.workingStatusId = workingStatusId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tn_m_working_status.working_status
	 * @return  the value of tn_m_working_status.working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	public String getWorkingStatus() {
		return workingStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tn_m_working_status.working_status
	 * @param workingStatus  the value for tn_m_working_status.working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	public void setWorkingStatus(String workingStatus) {
		this.workingStatus = workingStatus == null ? null : workingStatus.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tn_m_working_status.status
	 * @return  the value of tn_m_working_status.status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tn_m_working_status.status
	 * @param status  the value for tn_m_working_status.status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tn_m_working_status.created_by
	 * @return  the value of tn_m_working_status.created_by
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tn_m_working_status.created_by
	 * @param createdBy  the value for tn_m_working_status.created_by
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tn_m_working_status.created_date
	 * @return  the value of tn_m_working_status.created_date
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tn_m_working_status.created_date
	 * @param createdDate  the value for tn_m_working_status.created_date
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}