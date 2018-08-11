package com.patelki.map;

import com.patelki.domain.TnMEducation;
import com.patelki.domain.TnMEducationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface TnMEducationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_education
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    long countByExample(TnMEducationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_education
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int deleteByExample(TnMEducationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_education
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int deleteByPrimaryKey(Integer educationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_education
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int insert(TnMEducation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_education
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int insertSelective(TnMEducation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_education
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    List<TnMEducation> selectByExample(TnMEducationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_education
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    TnMEducation selectByPrimaryKey(Integer educationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_education
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int updateByExampleSelective(@Param("record") TnMEducation record, @Param("example") TnMEducationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_education
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int updateByExample(@Param("record") TnMEducation record, @Param("example") TnMEducationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_education
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int updateByPrimaryKeySelective(TnMEducation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_education
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int updateByPrimaryKey(TnMEducation record);
}