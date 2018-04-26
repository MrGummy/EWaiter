package com.mappers;

import com.model.Category;
import com.model.Dish;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface CategoryMapper {

    final String selectById = "SELECT * FROM category WHERE id = #{id}";
    final String selectAll = "SELECT * FROM category";
    final String selectCategories = "SELECT * FROM category WHERE menuId = #{id}";

    @Select(selectById)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "dishes", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishMapper.selectDishes")),
            @Result(property = "photo", column = "photo")
    })
    Category selectById(Integer id);

    @Select(selectAll)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "dishes", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishMapper.selectDishes")),
            @Result(property = "photo", column = "photo")
    })
    List<Category> selectAll();

    @Select(selectCategories)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "dishes", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishMapper.selectDishes")),
            @Result(property = "photo", column = "photo")
    })
    List<Category> selectCategories();

    @Delete("DELETE FROM category WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO category( 'name', 'description', 'photo') VALUES (#{name}, #{description}, #{photo})")
    int insert(Category category);

    @Update("UPDATE category SET name = #{name}, description = #{description}, photo = #{photo}")
    int update(Category category);
}