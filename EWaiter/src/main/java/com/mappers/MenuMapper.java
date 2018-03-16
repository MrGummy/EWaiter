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
            @Result(property = "categories", column = "id", javaType=List.class, many=@Many(select="com.mappers.CategoryMapper.selectCategories")),
            @Result(property = "date", column = "date")
    })

    @Select("SELECT * FROM menu WHERE companyId = #{id}")
    List<Menu> selectMenus();

    @Select("SELECT * FROM menu")
    List<Menu> selectAll();

    @Select("SELECT * FROM menu WHERE id = #{id}")
    Menu selectById(Integer id);

    @Delete("DELETE FROM menu WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO menu( 'name', 'description', 'date')" +
            " VALUES (#{name}, #{description}, #{date})")
    int insert(Menu menu);

    @Update("UPDATE menu SET name = #{name}, description = #{description}, date = #{date}")
    int update(Menu menu);
}
