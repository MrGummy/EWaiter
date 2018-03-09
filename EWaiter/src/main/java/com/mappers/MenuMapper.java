package com.mappers;

import com.model.Menu;
import com.model.Category;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface MenuMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "categories", column = "id", javaType=List.class, many=@Many(select="selectCategories")),
            @Result(property = "date", column = "date")
    })

    @Select("SELECT * FROM category WHERE menuId = #{id}")
    List<Category> selectCategories();

    @Select("SELECT * FROM menu")
    List<Menu> selectAll();

    @Select("SELECT * FROM menu WHERE id = #{id}")
    Menu selectById(int id);

    @Delete("DELETE FROM menu WHERE id = #{id}")
    int deleteById(int id);

    @Insert("INSERT INTO menu( 'name', 'description', 'categories', 'date')" +
            " VALUES (#{name}, #{description}, #{categories}, #{date})")
    int insert(Menu Menu);

    @Update("UPDATE menu SET name = #{name}, description = #{description}, categories = #{categories}, date = #{date}")
    int update(Menu Menu);
}
