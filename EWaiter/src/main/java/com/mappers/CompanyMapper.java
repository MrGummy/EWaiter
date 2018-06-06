package com.mappers;

import com.model.Company;
import com.model.Menu;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface CompanyMapper {

    final String selectById = "SELECT * FROM company WHERE id = #{id}";
    final String selectAll = "SELECT * FROM company";
    final String selectCompany = "SELECT id, name, regDate FROM company WHERE id = #{companyId}";

    @Select(selectById)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "login", column = "login"),
            @Result(property = "password", column = "password"),
            @Result(property = "menus", column = "id", javaType=List.class, many=@Many(select="com.mappers.MenuMapper.selectMenus")),
            @Result(property = "regDate", column = "regDate")
    })
    Company selectById(Integer id);

    @Select(selectAll)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "login", column = "login"),
            @Result(property = "password", column = "password"),
            @Result(property = "menus", column = "id", javaType=List.class, many=@Many(select="com.mappers.MenuMapper.selectMenus")),
            @Result(property = "regDate", column = "regDate")
    })
    List<Company> selectAll();

    @Select(selectCompany)
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "menus", column = "id", javaType=List.class, many=@Many(select="com.mappers.MenuMapper.selectMenus")),
            @Result(property = "regDate", column = "regDate")
    })
    Company selectCompany();

    @Delete("DELETE FROM company WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO company(name, login, password, regDate) VALUES (#{name}, #{login}, #{password},  #{regDate})")
    int insert(Company company);

    @Update("UPDATE company SET name = #{name}, login = #{login}, password = #{password}, regDate = #{regDate}")
    int update(Company company);
}
