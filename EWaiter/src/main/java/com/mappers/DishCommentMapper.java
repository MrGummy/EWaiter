package com.mappers;

import com.model.DishComment;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface DishCommentMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "comment", column = "comment"),
            @Result(property = "date", column = "date")
    })

    @Select("SELECT * FROM dishComment")
    List<DishComment> selectAll();

    @Select("SELECT * FROM dishComment WHERE id = #{id}")
    DishComment selectById(int id);

    @Delete("DELETE FROM dishComment WHERE id = #{id}")
    int deleteById(int id);

    @Insert("INSERT INTO dishComment('comment', 'date') VALUES (#{comment}, #{date})")
    int insert(DishComment DishComment);

    @Update("UPDATE dishComment SET comment = #{comment}, date = #{date}")
    int update(DishComment DishComment);
}