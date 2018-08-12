package com.patelki.mapper;

import com.patelki.domain.TnMAddressType;
import com.patelki.domain.TnMAddressTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TnMAddressTypeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_address_type
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	long countByExample(TnMAddressTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_address_type
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int deleteByExample(TnMAddressTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_address_type
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int deleteByPrimaryKey(Integer addressTypeId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_address_type
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int insert(TnMAddressType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_address_type
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int insertSelective(TnMAddressType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_address_type
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */List<TnMAddressType> selectByExample(TnMAddressTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_address_type
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	TnMAddressType selectByPrimaryKey(Integer addressTypeId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_address_type
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */int updateByExampleSelective(@Param("record") TnMAddressType record,@Param("example") TnMAddressTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_address_type
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */int updateByExample(@Param("record") TnMAddressType record,@Param("example") TnMAddressTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_address_type
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int updateByPrimaryKeySelective(TnMAddressType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tn_m_address_type
	 * @mbg.generated  Sun Aug 12 22:30:57 WIB 2018
	 */
	int updateByPrimaryKey(TnMAddressType record);
}