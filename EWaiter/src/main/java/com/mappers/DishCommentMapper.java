//package com.mappers;
//
//import com.model.DishComment;
//import org.apache.ibatis.annotations.*;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//
//@Service
//public interface DishCommentMapper {
//    @Results({
//            @Result(property = "id", column = "id"),
//            @Result(property = "comment", column = "comment"),
//            @Result(property = "dateTime", column = "dateTime")
//    })
//
//    @Select("SELECT * FROM dishcomment WHERE dishId = #{id}")
//    List<DishComment> selectDishComments();
//
//    @Select("SELECT * FROM dishcomment")
//    List<DishComment> selectAll();
//
//    @Select("SELECT * FROM dishcomment WHERE id = #{id}")
//    DishComment selectById(Integer id);
//
//    @Delete("DELETE FROM dishcomment WHERE id = #{id}")
//    int deleteById(Integer id);
//
//    @Insert("INSERT INTO dishcomment('comment', 'dateTime') VALUES (#{comment}, #{dateTime})")
//    int insert(DishComment dishComment);
//
//    @Update("UPDATE dishcomment SET comment = #{comment}, dateTime = #{dateTime}")
//    int update(DishComment dishComment);
//}