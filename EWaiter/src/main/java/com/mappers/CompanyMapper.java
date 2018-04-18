package com.mappers;

import com.model.Company;
import com.model.Menu;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface CompanyMapper {
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "login", column = "login"),
            @Result(property = "password", column = "password"),
            //@Result(property = "menus", column = "id", javaType=List.class, many=@Many(select="com.mappers.MenuMapper.selectMenus")),
            @Result(property = "date", column = "date")
    })

    @Select("SELECT * FROM company WHERE id = #{companyId}")
    Company selectCompany();

    @Select("SELECT * FROM company")
    List<Company> selectAll();

    @Select("SELECT * FROM company WHERE id = #{id}")
    Company selectById(Integer id);

    @Delete("DELETE FROM company WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO company('name', 'login', 'password', 'date') VALUES (#{name}, #{login}, #{password},  #{date})")
    int insert(Company company);

    @Update("UPDATE company SET name = #{name}, login = #{login}, password = #{password}, date = #{date}")
    int update(Company company);
}
