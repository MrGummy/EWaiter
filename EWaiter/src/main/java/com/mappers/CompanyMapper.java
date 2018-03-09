package com.mappers;

import com.model.Company;
import com.model.Menu;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface CompanyMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "login", column = "login"),
            @Result(property = "password", column = "password"),
            @Result(property = "menus", column = "id", javaType=List.class, many=@Many(select="selectMenus")),
            @Result(property = "date", column = "date")
    })

    @Select("SELECT * FROM menu WHERE companyId = #{id}")
    List<Menu> selectMenus();

    @Select("SELECT * FROM company")
    List<Company> selectAll();

    @Select("SELECT * FROM company WHERE id = #{id}")
    Company selectById(int id);

    @Delete("DELETE FROM company WHERE id = #{id}")
    int deleteById(int id);

    @Insert("INSERT INTO company('name', 'login', 'password', 'menu', 'date') VALUES (#{name}, #{login}, #{password}, #{menu}, #{date})")
    int insert(Company Company);

    @Update("UPDATE company SET name = #{name}, login = #{login}, password = #{password}, menu = #{menu}, date = #{date}")
    int update(Company Company);
}
