package com.mappers;

import com.model.Dish;
import com.model.DishComment;
import com.model.DishPhoto;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface DishMapper {

    final String selectById = "SELECT * FROM dish WHERE id = #{id}";
    final String selectAll = "SELECT * FROM dish";
    final String selectDishes = "SELECT * FROM dish WHERE categoryId = #{id}";
    final String selectOrderDishes = "SELECT * FROM dish WHERE id = #{id}";

    @Select(selectById)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "weight", column = "weight"),
            @Result(property = "price", column = "price"),
            @Result(property = "cookTime", column = "cookTime"),
            @Result(property = "photos", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishPhotoMapper.selectDishPhotos")),
            @Result(property = "comments", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishCommentMapper.selectDishComments"))
    })
    Dish selectById(Integer id);

    @Select(selectAll)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "weight", column = "weight"),
            @Result(property = "price", column = "price"),
            @Result(property = "cookTime", column = "cookTime"),
            @Result(property = "photos", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishPhotoMapper.selectDishPhotos")),
            @Result(property = "comments", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishCommentMapper.selectDishComments"))
    })
    List<Dish> selectAll();

    @Select(selectDishes)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "weight", column = "weight"),
            @Result(property = "price", column = "price"),
            @Result(property = "cookTime", column = "cookTime"),
            @Result(property = "photos", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishPhotoMapper.selectDishPhotos")),
            @Result(property = "comments", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishCommentMapper.selectDishComments"))
    })
    List<Dish> selectDishes();

    @Select(selectOrderDishes)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "weight", column = "weight"),
            @Result(property = "price", column = "price"),
            @Result(property = "cookTime", column = "cookTime"),
            @Result(property = "photos", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishPhotoMapper.selectDishPhotos")),
            @Result(property = "comments", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishCommentMapper.selectDishComments"))
    })
    List<Dish> selectOrderDishes();

    @Delete("DELETE FROM dish WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO dish('name', 'description', 'weight', 'price', 'cookTime') " +
            "VALUES (#{name}, #{description}, #{weight}, #{price}, #{cookTime}")
    int insert(Dish dish);

    @Update("UPDATE dish SET name = #{name}, description = #{description}, weight = #{weight}, price = #{price}, cookTime = #{cookTime}")
    int update(Dish dish);
}
