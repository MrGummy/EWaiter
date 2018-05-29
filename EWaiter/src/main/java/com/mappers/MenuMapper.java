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
    final String selectByCompanyId = "SELECT * FROM menu WHERE companyId = #{id}";

    @Select(selectById)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "categories", column = "id", javaType=List.class, many=@Many(select="com.mappers.CategoryMapper.selectCategories")),
            @Result(property = "date", column = "date"),
            @Result(property = "photo", column = "photo")
    })
    Menu selectById(Integer id);

    @Select(selectAll)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "categories", column = "id", javaType=List.class, many=@Many(select="com.mappers.CategoryMapper.selectCategories")),
            @Result(property = "date", column = "date"),
            @Result(property = "photo", column = "photo")
    })
    List<Menu> selectAll();

    @Select(selectMenus)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "categories", column = "id", javaType=List.class, many=@Many(select="com.mappers.CategoryMapper.selectCategories")),
            @Result(property = "date", column = "date"),
            @Result(property = "photo", column = "photo")
    })
    List<Menu> selectMenus();

    @Select(selectByCompanyId)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description"),
            @Result(property = "categories", column = "id", javaType=List.class, many=@Many(select="com.mappers.CategoryMapper.selectCategories")),
            @Result(property = "date", column = "date"),
            @Result(property = "photo", column = "photo")
    })
    List<Menu> selectByCompanyId(Integer id);

    @Delete("DELETE FROM menu WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO menu(name, description, date, photo)" +
            " VALUES (#{name}, #{description}, #{date}, #{photo})")
    int insert(Menu menu);

    @Update("UPDATE menu SET name = #{name}, description = #{description}, date = #{date}, photo = #{photo}")
    int update(Menu menu);
}
