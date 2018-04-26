package com.mappers;

import com.model.Order;
import com.model.Dish;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface OrderMapper {

    final String selectById = "SELECT * FROM `order` WHERE id = #{id}";
    final String selectAll = "SELECT * FROM `order`";

    @Select(selectById)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "tableId", column = "tableId"),
            @Result(property = "waiterId", column = "waiterId"),
            @Result(property = "`dateTime`", column = "`dateTime`"),
            @Result(property = "dishes", column = "id", javaType = List.class, many = @Many(select="com.mappers.DishMapper.selectOrderDishes"))
    })
    Order selectById(Integer id);

    @Select(selectAll)
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "tableId", column = "tableId"),
            @Result(property = "waiterId", column = "waiterId"),
            @Result(property = "`dateTime`", column = "`dateTime`"),
            @Result(property = "dishes", column = "id", javaType = List.class, many = @Many(select="com.mappers.DishMapper.selectOrderDishes"))
    })
    List<Order> selectAll();

    @Delete("DELETE FROM `order` WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO `order`('tableId', 'waiterId', '`dateTime`')" +
            " VALUES (#{tableId}, #{waiterId}, #{`dateTime`})")
    int insert(Order order);

    @Update("UPDATE `order` SET tableId = #{tableId}, waiterId = #{waiterId}, `dateTime` = #{`dateTime`}")
    int update(Order order);
}