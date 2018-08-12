package com.patelki.mapper;

import com.patelki.domain.TnMInstitution;
import com.patelki.domain.TnMInstitutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TnMInstitutionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_institution
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	long countByExample(TnMInstitutionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_institution
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int deleteByExample(TnMInstitutionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_institution
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int deleteByPrimaryKey(Integer institutionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_institution
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int insert(TnMInstitution record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_institution
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int insertSelective(TnMInstitution record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_institution
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */List<TnMInstitution> selectByExample(TnMInstitutionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_institution
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	TnMInstitution selectByPrimaryKey(Integer institutionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_institution
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */int updateByExampleSelective(@Param("record") TnMInstitution record,@Param("example") TnMInstitutionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_institution
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */int updateByExample(@Param("record") TnMInstitution record,@Param("example") TnMInstitutionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_institution
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int updateByPrimaryKeySelective(TnMInstitution record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_institution
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int updateByPrimaryKey(TnMInstitution record);
}