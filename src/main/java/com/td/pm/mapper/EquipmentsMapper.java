package com.td.pm.mapper;

import com.td.pm.bean.Equipments;
import com.td.pm.bean.EquipmentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentsMapper {
    int countByExample(EquipmentsExample example);

    int deleteByExample(EquipmentsExample example);

    int deleteByPrimaryKey(String equipId);

    int deleteByPrimaryKeys(List<String> list);

    int insert(Equipments record);

    int insertSelective(Equipments record);

    List<Equipments> selectByExample(EquipmentsExample example);

    Equipments selectByPrimaryKey(String equipId);


    int updateByExampleSelective(@Param("record") Equipments record, @Param("example") EquipmentsExample example);

    int updateByExample(@Param("record") Equipments record, @Param("example") EquipmentsExample example);

    int updateByPrimaryKeySelective(Equipments record);

    int updateByPrimaryKey(Equipments record);
    List<Equipments> queryAll();
}