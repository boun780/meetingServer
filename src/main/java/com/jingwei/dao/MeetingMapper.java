package com.jingwei.dao;

import com.jingwei.pojo.Meeting;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MeetingMapper {
    //query
    public Meeting queryMeetingRecordByIndex(int index);
    public List<Meeting> queryMeetingRecordsByUsername(String username);

    //insert
    public int insertNewMeetingRecord(Meeting meeting);

}
