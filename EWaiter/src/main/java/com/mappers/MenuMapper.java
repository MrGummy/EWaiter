package com.mappers;

import com.model.Menu;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface MenuMapper {

    final String selectById = "SELECT * FROM menu WHERE id = #{id}";
    final String selectAll = "SELECT * FROM menu";
    final String selectMenus = "SELECT * FROM menu WHERE companyId = #{id}";

    @Select(selectById)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "categories", column = "id", javaType=List.class, many=@Many(select="com.mappers.CategoryMapper.selectCategories")),
            @Result(property = "date", column = "date")
    })
    Menu selectById(Integer id);

    @Select(selectAll)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "categories", column = "id", javaType=List.class, many=@Many(select="com.mappers.CategoryMapper.selectCategories")),
            @Result(property = "date", column = "date")
    })
    List<Menu> selectAll();

    @Select(selectMenus)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "categories", column = "id", javaType=List.class, many=@Many(select="com.mappers.CategoryMapper.selectCategories")),
            @Result(property = "date", column = "date")
    })
    List<Menu> selectMenus();

    @Delete("DELETE FROM menu WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO menu( 'name', 'description', 'date')" +
            " VALUES (#{name}, #{description}, #{date})")
    int insert(Menu menu);

    @Update("UPDATE menu SET name = #{name}, description = #{description}, date = #{date}")
    int update(Menu menu);
}
