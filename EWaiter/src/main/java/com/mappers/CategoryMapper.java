package com.mappers;

import com.model.Category;
import com.model.Dish;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface CategoryMapper {
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "dishes", column = "id", javaType=List.class, many=@Many(select="com.mappers.DishMapper.selectDishes")),
            @Result(property = "photo", column = "photo")
    })

    @Select("SELECT * FROM category WHERE menuId = #{id}")
    List<Category> selectCategories();

    @Select("SELECT * FROM category")
    List<Category> selectAll();

    @Select("SELECT * FROM category WHERE id = #{id}")
    Category selectById(Integer id);

    @Delete("DELETE FROM category WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO category( 'name', 'description', 'photo') VALUES (#{name}, #{description}, #{photo})")
    int insert(Category category);

    @Update("UPDATE category SET name = #{name}, description = #{description}, photo = #{photo}")
    int update(Category category);
}