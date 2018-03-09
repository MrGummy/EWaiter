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
            @Result(property = "dishes", column = "id", javaType=List.class, many=@Many(select="selectDishes")),
            @Result(property = "photo", column = "photo")
    })

    @Select("SELECT * FROM dish WHERE categoryId = #{id}")
    List<Dish> selectDishes();

    @Select("SELECT * FROM category")
    List<Category> selectAll();

    @Select("SELECT * FROM category WHERE id = #{id}")
    Category selectById(Integer id);

    @Delete("DELETE FROM category WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO category( 'name', 'description', 'dishes', 'photo') VALUES (#{name}, #{description}, #{dishes}, #{photo})")
    int insert(Category category);

    @Update("UPDATE category SET name = #{name}, description = #{description}, dishes = #{dishes}, photo = #{photo}")
    int update(Category category);
}