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
            @Result(property = "dateTime", column = "dateTime")
    })

    @Select("SELECT * FROM dishComment WHERE dishId = #{id}")
    List<DishComment> selectDishComments();

    @Select("SELECT * FROM dishComment")
    List<DishComment> selectAll();

    @Select("SELECT * FROM dishComment WHERE id = #{id}")
    DishComment selectById(Integer id);

    @Delete("DELETE FROM dishComment WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO dishComment('comment', 'dateTime') VALUES (#{comment}, #{dateTime})")
    int insert(DishComment dishComment);

    @Update("UPDATE dishComment SET comment = #{comment}, dateTime = #{dateTime}")
    int update(DishComment dishComment);
}