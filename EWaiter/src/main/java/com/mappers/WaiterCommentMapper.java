package com.mappers;

import com.model.WaiterComment;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface WaiterCommentMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "comment", column = "comment"),
            @Result(property = "dateTime", column = "dateTime")
    })

    @Select("SELECT * FROM waitercomment WHERE waiterId = #{id}")
    List<WaiterComment> selectWaiterComments();

    @Select("SELECT * FROM waitercomment")
    List<WaiterComment> selectAll();

    @Select("SELECT * FROM waitercomment WHERE id = #{id}")
    WaiterComment selectById(Integer id);

//    @Delete("DELETE FROM waitercomment WHERE id = #{id}")
//    int deleteById(Integer id);
//
//    @Insert("INSERT INTO waitercomment('comment', 'dateTime') VALUES (#{comment}, #{dateTime})")
//    int insert(WaiterComment waiterComment);
//
//    @Update("UPDATE waitercomment SET comment = #{comment}, dateTime = #{dateTime}")
//    int update(WaiterComment waiterComment);
}
