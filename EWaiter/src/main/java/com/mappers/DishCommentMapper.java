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
            @Result(property = "dateTime", column = "dateTime"),
            @Result(property = "dishId", column = "dishId")
    })

    @Select("SELECT * FROM dishcomment WHERE dishId = #{id}")
    List<DishComment> selectDishComments();

    @Select("SELECT * FROM dishcomment")
    List<DishComment> selectAll();

    @Select("SELECT * FROM dishcomment WHERE id = #{id}")
    DishComment selectById(Integer id);

    @Delete("DELETE FROM dishcomment WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO dishcomment(comment, dateTime, dishId) VALUES (#{comment}, #{dateTime}, #{dishId})")
    int insert(DishComment dishComment);

    @Update("UPDATE dishcomment SET comment = #{comment}, dateTime = #{dateTime}, dishId = #{dishId}")
    int update(DishComment dishComment);
}