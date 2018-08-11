package com.patelki.map;

import com.patelki.domain.TnMCard;
import com.patelki.domain.TnMCardExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface TnMCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_card
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    long countByExample(TnMCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_card
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int deleteByExample(TnMCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_card
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int deleteByPrimaryKey(Integer cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_card
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int insert(TnMCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_card
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int insertSelective(TnMCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_card
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    List<TnMCard> selectByExample(TnMCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_card
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    TnMCard selectByPrimaryKey(Integer cardId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_card
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int updateByExampleSelective(@Param("record") TnMCard record, @Param("example") TnMCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_card
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int updateByExample(@Param("record") TnMCard record, @Param("example") TnMCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_card
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int updateByPrimaryKeySelective(TnMCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tn_m_card
     *
     * @mbg.generated Sat Aug 11 20:55:03 WIB 2018
     */
    int updateByPrimaryKey(TnMCard record);
}