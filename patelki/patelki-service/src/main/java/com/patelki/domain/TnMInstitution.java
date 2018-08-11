package com.patelki.domain;

import java.util.Date;

public class TnMInstitution {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tn_m_institution.institution_id
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    private Integer institutionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tn_m_institution.institution_type_id
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    private Integer institutionTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tn_m_institution.institution_code
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    private String institutionCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tn_m_institution.city_id
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    private Integer cityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tn_m_institution.full_address
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    private String fullAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tn_m_institution.telp_no
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    private String telpNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tn_m_institution.fax_no
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    private String faxNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tn_m_institution.status
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tn_m_institution.created_by
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    private Integer createdBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tn_m_institution.created_date
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    private Date createdDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tn_m_institution.institution_id
     *
     * @return the value of tn_m_institution.institution_id
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public Integer getInstitutionId() {
        return institutionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tn_m_institution.institution_id
     *
     * @param institutionId the value for tn_m_institution.institution_id
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tn_m_institution.institution_type_id
     *
     * @return the value of tn_m_institution.institution_type_id
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public Integer getInstitutionTypeId() {
        return institutionTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tn_m_institution.institution_type_id
     *
     * @param institutionTypeId the value for tn_m_institution.institution_type_id
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setInstitutionTypeId(Integer institutionTypeId) {
        this.institutionTypeId = institutionTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tn_m_institution.institution_code
     *
     * @return the value of tn_m_institution.institution_code
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public String getInstitutionCode() {
        return institutionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tn_m_institution.institution_code
     *
     * @param institutionCode the value for tn_m_institution.institution_code
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode == null ? null : institutionCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tn_m_institution.city_id
     *
     * @return the value of tn_m_institution.city_id
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tn_m_institution.city_id
     *
     * @param cityId the value for tn_m_institution.city_id
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tn_m_institution.full_address
     *
     * @return the value of tn_m_institution.full_address
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tn_m_institution.full_address
     *
     * @param fullAddress the value for tn_m_institution.full_address
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress == null ? null : fullAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tn_m_institution.telp_no
     *
     * @return the value of tn_m_institution.telp_no
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public String getTelpNo() {
        return telpNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tn_m_institution.telp_no
     *
     * @param telpNo the value for tn_m_institution.telp_no
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setTelpNo(String telpNo) {
        this.telpNo = telpNo == null ? null : telpNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tn_m_institution.fax_no
     *
     * @return the value of tn_m_institution.fax_no
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tn_m_institution.fax_no
     *
     * @param faxNo the value for tn_m_institution.fax_no
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo == null ? null : faxNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tn_m_institution.status
     *
     * @return the value of tn_m_institution.status
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tn_m_institution.status
     *
     * @param status the value for tn_m_institution.status
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tn_m_institution.created_by
     *
     * @return the value of tn_m_institution.created_by
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tn_m_institution.created_by
     *
     * @param createdBy the value for tn_m_institution.created_by
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tn_m_institution.created_date
     *
     * @return the value of tn_m_institution.created_date
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tn_m_institution.created_date
     *
     * @param createdDate the value for tn_m_institution.created_date
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}