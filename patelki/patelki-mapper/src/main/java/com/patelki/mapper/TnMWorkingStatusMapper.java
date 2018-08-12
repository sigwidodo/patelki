package com.patelki.mapper;

import com.patelki.domain.TnMWorkingStatus;
import com.patelki.domain.TnMWorkingStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TnMWorkingStatusMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	long countByExample(TnMWorkingStatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int deleteByExample(TnMWorkingStatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int deleteByPrimaryKey(Integer workingStatusId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int insert(TnMWorkingStatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int insertSelective(TnMWorkingStatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */List<TnMWorkingStatus> selectByExample(TnMWorkingStatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	TnMWorkingStatus selectByPrimaryKey(Integer workingStatusId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */int updateByExampleSelective(@Param("record") TnMWorkingStatus record,@Param("example") TnMWorkingStatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */int updateByExample(@Param("record") TnMWorkingStatus record,@Param("example") TnMWorkingStatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int updateByPrimaryKeySelective(TnMWorkingStatus record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_working_status
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int updateByPrimaryKey(TnMWorkingStatus record);
}