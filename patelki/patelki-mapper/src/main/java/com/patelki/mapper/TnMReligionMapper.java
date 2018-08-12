package com.patelki.mapper;

import com.patelki.domain.TnMReligion;
import com.patelki.domain.TnMReligionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TnMReligionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_religion
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	long countByExample(TnMReligionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_religion
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int deleteByExample(TnMReligionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_religion
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int deleteByPrimaryKey(Integer religionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_religion
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int insert(TnMReligion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_religion
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int insertSelective(TnMReligion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_religion
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */List<TnMReligion> selectByExample(TnMReligionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_religion
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	TnMReligion selectByPrimaryKey(Integer religionId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_religion
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */int updateByExampleSelective(@Param("record") TnMReligion record,@Param("example") TnMReligionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_religion
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */int updateByExample(@Param("record") TnMReligion record,@Param("example") TnMReligionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_religion
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int updateByPrimaryKeySelective(TnMReligion record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_religion
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int updateByPrimaryKey(TnMReligion record);
}