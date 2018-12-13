package com.td.pm.mapper;

import com.td.pm.bean.Fine;
import com.td.pm.bean.FineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FineMapper {
    int countByExample(FineExample example);

    int deleteByExample(FineExample example);

    int deleteByPrimaryKey(Integer fineId);

    int insert(Fine record);

    int insertSelective(Fine record);

    List<Fine> selectByExample(FineExample example);

    Fine selectByPrimaryKey(Integer fineId);

    int updateByExampleSelective(@Param("record") Fine record, @Param("example") FineExample example);

    int updateByExample(@Param("record") Fine record, @Param("example") FineExample example);

    int updateByPrimaryKeySelective(Fine record);

    int updateByPrimaryKey(Fine record);
}