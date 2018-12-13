package com.td.pm.mapper;

import com.td.pm.bean.PersonSchedule;
import com.td.pm.bean.PersonScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonScheduleMapper {
    int countByExample(PersonScheduleExample example);

    int deleteByExample(PersonScheduleExample example);

    int deleteByPrimaryKey(Integer personscheduleId);

    int insert(PersonSchedule record);

    int insertSelective(PersonSchedule record);

    List<PersonSchedule> selectByExample(PersonScheduleExample example);

    PersonSchedule selectByPrimaryKey(Integer personscheduleId);

    int updateByExampleSelective(@Param("record") PersonSchedule record, @Param("example") PersonScheduleExample example);

    int updateByExample(@Param("record") PersonSchedule record, @Param("example") PersonScheduleExample example);

    int updateByPrimaryKeySelective(PersonSchedule record);

    int updateByPrimaryKey(PersonSchedule record);
}