package com.mappers;

import com.model.Order;
import com.model.Dish;
import com.model.Table;
import com.model.Waiter;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface OrderMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "table", column = "id", javaType=Table.class, one=@One(select="selectTable")),
            @Result(property = "waiter", column = "id", javaType=Waiter.class, one=@One(select="selectWaiter")),
            @Result(property = "dateTime", column = "dateTime"),
            @Result(property = "dishes", column = "id", javaType=List.class, many=@Many(select="selectDishes"))

    })

    @Select("SELECT * FROM `table` WHERE id = (SELECT tableId FROM `order` WHERE id = #{id})")
    Table selectTable();

    @Select("SELECT * FROM waiter WHERE id = (SELECT waiterId FROM `order` WHERE id = #{id})")
    Waiter selectWaiter();

    // ??????????????????? not true
    @Select("SELECT * FROM dish WHERE id = (SELECT dishId FROM dishOrder WHERE orderId = #{id})")
    List<Dish> selectDishes();

    @Select("SELECT * FROM `order`")
    List<Order> selectAll();

    @Select("SELECT * FROM `order` WHERE id = #{id}")
    Order selectById(Integer id);

    @Delete("DELETE FROM `order` WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO `order`( 'table', 'waiter', 'dateTime', 'dishes')" +
            " VALUES (#{table}, #{waiter}, #{dateTime}, #{dishes})")
    int insert(Order order);

    @Update("UPDATE `order` SET table = #{table}, waiter = #{waiter}, dateTime = #{dateTime}, dishes = #{dishes}")
    int update(Order order);
}