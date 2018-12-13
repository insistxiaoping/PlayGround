package com.td.pm.mapper;

import com.td.pm.bean.ApplyArea;
import com.td.pm.bean.ApplyAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyAreaMapper {
    int countByExample(ApplyAreaExample example);

    int deleteByExample(ApplyAreaExample example);

    int deleteByPrimaryKey(Integer applyId);

    int insert(ApplyArea record);

    int insertSelective(ApplyArea record);

    List<ApplyArea> selectByExample(ApplyAreaExample example);

    ApplyArea selectByPrimaryKey(Integer applyId);

    int updateByExampleSelective(@Param("record") ApplyArea record, @Param("example") ApplyAreaExample example);

    int updateByExample(@Param("record") ApplyArea record, @Param("example") ApplyAreaExample example);

    int updateByPrimaryKeySelective(ApplyArea record);

    int updateByPrimaryKey(ApplyArea record);
}