package com.mappers;

import com.model.Order;
import com.model.Dish;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface OrderMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "tableId", column = "tableId"),
            @Result(property = "waiterId", column = "waiterId"),
            @Result(property = "`dateTime`", column = "`dateTime`"),
            @Result(property = "dishes", column = "id", javaType = List.class, many = @Many(select="com.mappers.DishMapper.selectOrderDishes"))
    })

    @Select("SELECT * FROM `order`")
    List<Order> selectAll();

    @Select("SELECT * FROM `order` WHERE id = #{id}")
    Order selectById(Integer id);

    @Delete("DELETE FROM `order` WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO `order`('tableId', 'waiterId', '`dateTime`')" +
            " VALUES (#{tableId}, #{waiterId}, #{`dateTime`})")
    int insert(Order order);

    @Update("UPDATE `order` SET tableId = #{tableId}, waiterId = #{waiterId}, `dateTime` = #{`dateTime`}")
    int update(Order order);
}