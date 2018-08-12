package com.patelki.mapper;

import com.patelki.domain.TnMProvince;
import com.patelki.domain.TnMProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TnMProvinceMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_province
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	long countByExample(TnMProvinceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_province
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int deleteByExample(TnMProvinceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_province
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int deleteByPrimaryKey(Integer provinceId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_province
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int insert(TnMProvince record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_province
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int insertSelective(TnMProvince record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_province
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */List<TnMProvince> selectByExample(TnMProvinceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_province
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	TnMProvince selectByPrimaryKey(Integer provinceId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_province
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */int updateByExampleSelective(@Param("record") TnMProvince record,@Param("example") TnMProvinceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_province
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */int updateByExample(@Param("record") TnMProvince record,@Param("example") TnMProvinceExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_province
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int updateByPrimaryKeySelective(TnMProvince record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_province
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int updateByPrimaryKey(TnMProvince record);
}