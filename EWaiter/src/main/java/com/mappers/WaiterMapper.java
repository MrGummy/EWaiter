package com.mappers;

import com.model.Company;
import com.model.Waiter;
import com.model.WaiterComment;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface WaiterMapper {

    final String selectById = "SELECT * FROM waiter WHERE id = #{id}";
    final String selectAll = "SELECT * FROM waiter";

    @Select(selectById)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "company", column = "companyId", javaType=Company.class, one=@One(select="com.mappers.CompanyMapper.selectCompany")),
            @Result(property = "firstName", column = "firstName"),
            @Result(property = "lastName", column = "lastName"),
            @Result(property = "login", column = "login"),
            @Result(property = "password", column = "password"),
            @Result(property = "photo", column = "photo"),
            @Result(property = "comments", column="id", javaType=List.class, many=@Many(select="com.mappers.WaiterCommentMapper.selectWaiterComments"))
    })
    Waiter selectById(Integer id);

    @Select(selectAll)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "company", column = "companyId", javaType=Company.class, one=@One(select="com.mappers.CompanyMapper.selectCompany")),
            @Result(property = "firstName", column = "firstName"),
            @Result(property = "lastName", column = "lastName"),
            @Result(property = "login", column = "login"),
            @Result(property = "password", column = "password"),
            @Result(property = "photo", column = "photo"),
            @Result(property = "comments", column="id", javaType=List.class, many=@Many(select="com.mappers.WaiterCommentMapper.selectWaiterComments"))
    })
    List<Waiter> selectAll();

    @Delete("DELETE FROM waiter WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO waiter('firstName', 'lastName', 'login', 'password', 'photo') " +
            "VALUES (#{firstName}, #{lastName}, #{login}, #{password}, #{photo})")
    int insert(Waiter waiter);

    @Update("UPDATE waiter SET firstName = #{firstName}, lastName = #{lastName}, login = #{login}, password = #{password}, photo = #{photo}")
    int update(Waiter waiter);
}
