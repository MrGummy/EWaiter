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
            @Result(property = "date", column = "date")
    })

    @Select("SELECT * FROM waiterComment")
    List<WaiterComment> selectAll();

    @Select("SELECT * FROM waiterComment WHERE id = #{id}")
    WaiterComment selectById(int id);

    @Delete("DELETE FROM waiterComment WHERE id = #{id}")
    int deleteById(int id);

    @Insert("INSERT INTO waiterComment('comment', 'date') VALUES (#{comment}, #{date})")
    int insert(WaiterComment WaiterComment);

    @Update("UPDATE waiterComment SET comment = #{comment}, date = #{date}")
    int update(WaiterComment WaiterComment);
}
