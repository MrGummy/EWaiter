package com.mappers;

import com.model.Dish;
import com.model.DishComment;
import com.model.DishPhoto;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface DishMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "weight", column = "weight"),
            @Result(property = "price", column = "price"),
            @Result(property = "cookTime", column = "cookTime"),
            @Result(property = "photos", column = "id", javaType=List.class, many=@Many(select="selectDishPhotos")),
            @Result(property = "comments", column = "id", javaType=List.class, many=@Many(select="selectDishComments"))
    })

    @Select("SELECT * FROM dishPhoto WHERE dishId = #{id}")
    List<DishPhoto> selectDishPhotos();

    @Select("SELECT * FROM dishComment WHERE dishId = #{id}")
    List<DishComment> selectDishComments();

    @Select("SELECT * FROM dish")
    List<Dish> selectAll();

    @Select("SELECT * FROM dish WHERE id = #{id}")
    Dish selectById(Integer id);

    @Delete("DELETE FROM dish WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO dish('name', 'description', 'weight', 'price', 'cookTime', 'photos', 'comments') " +
            "VALUES (#{name}, #{description}, #{weight}, #{price}, #{cookTime}, #{photos}, #{comments})")
    int insert(Dish dish);

    @Update("UPDATE dish SET name = #{name}, description = #{description}, weight = #{weight}, price = #{price}, cookTime = #{cookTime}, photos = #{photos}, comments = #{comments}")
    int update(Dish dish);
}
