package com.mappers;

import com.model.Waiter;
import com.model.Menu;
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
            @Result(property = "comments", column = "id", javaType=List.class, many=@Many(select="selectWaiterComments"))
    })

    @Select("SELECT * FROM comment WHERE waiterId = #{id}")
    List<WaiterComment> selectWaiterComments();

    @Select("SELECT * FROM waiter")
    List<Waiter> selectAll();

    @Select("SELECT * FROM waiter WHERE id = #{id}")
    Waiter selectById(int id);

    @Delete("DELETE FROM waiter WHERE id = #{id}")
    int deleteById(int id);

    @Insert("INSERT INTO waiter('firstName', 'lastName', 'login', 'password', 'photo', 'comments') " +
            "VALUES (#{firstName}, #{lastName}, #{login}, #{password}, #{photo}, #{comments})")
    int insert(Waiter Waiter);

    @Update("UPDATE waiter SET firstName = #{firstName}, lastName = #{lastName}, login = #{login}, password = #{password}, photo = #{photo}, comments = #{comments}")
    int update(Waiter Waiter);
}
