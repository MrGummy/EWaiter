package com.mappers;

import com.model.Waiter;
import com.model.WaiterComment;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface WaiterMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "firstName", column = "firstName"),
            @Result(property = "lastName", column = "lastName"),
            @Result(property = "login", column = "login"),
            @Result(property = "password", column = "password"),
            @Result(property = "photo", column = "photo"),
            @Result(property = "comments", column = "id", javaType=List.class, many=@Many(select="com.mappers.WaiterCommentMapper.selectWaiterComments"))
    })

    @Select("SELECT * FROM waiter")
    List<Waiter> selectAll();

    @Select("SELECT * FROM waiter WHERE id = #{id}")
    Waiter selectById(Integer id);

//    @Delete("DELETE FROM waiter WHERE id = #{id}")
//    int deleteById(Integer id);
//
//    @Insert("INSERT INTO waiter('firstName', 'lastName', 'login', 'password', 'photo') " +
//            "VALUES (#{firstName}, #{lastName}, #{login}, #{password}, #{photo})")
//    int insert(Waiter waiter);
//
//    @Update("UPDATE waiter SET firstName = #{firstName}, lastName = #{lastName}, login = #{login}, password = #{password}, photo = #{photo}")
//    int update(Waiter waiter);
}
