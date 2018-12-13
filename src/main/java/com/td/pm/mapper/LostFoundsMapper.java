package com.td.pm.mapper;

import com.td.pm.bean.LostFounds;
import com.td.pm.bean.LostFoundsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LostFoundsMapper {
    int countByExample(LostFoundsExample example);

    int deleteByExample(LostFoundsExample example);

    int deleteByPrimaryKey(Integer ladId);

    int insert(LostFounds record);

    int insertSelective(LostFounds record);

    List<LostFounds> selectByExample(LostFoundsExample example);

    LostFounds selectByPrimaryKey(Integer ladId);

    int updateByExampleSelective(@Param("record") LostFounds record, @Param("example") LostFoundsExample example);

    int updateByExample(@Param("record") LostFounds record, @Param("example") LostFoundsExample example);

    int updateByPrimaryKeySelective(LostFounds record);

    int updateByPrimaryKey(LostFounds record);
}