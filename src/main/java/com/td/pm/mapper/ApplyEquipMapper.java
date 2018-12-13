package com.td.pm.mapper;

import com.td.pm.bean.ApplyEquip;
import com.td.pm.bean.ApplyEquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplyEquipMapper {
    int countByExample(ApplyEquipExample example);

    int deleteByExample(ApplyEquipExample example);

    int deleteByPrimaryKey(Integer applyId);

    int insert(ApplyEquip record);

    int insertSelective(ApplyEquip record);

    List<ApplyEquip> selectByExample(ApplyEquipExample example);

    ApplyEquip selectByPrimaryKey(Integer applyId);

    int updateByExampleSelective(@Param("record") ApplyEquip record, @Param("example") ApplyEquipExample example);

    int updateByExample(@Param("record") ApplyEquip record, @Param("example") ApplyEquipExample example);

    int updateByPrimaryKeySelective(ApplyEquip record);

    int updateByPrimaryKey(ApplyEquip record);
}