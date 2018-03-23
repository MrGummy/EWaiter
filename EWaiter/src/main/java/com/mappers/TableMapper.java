//package com.mappers;
//
//import com.model.Table;
//import org.apache.ibatis.annotations.*;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//
//@Service
//public interface TableMapper {
//    @Results({
//            @Result(property = "id", column = "id"),
//            @Result(property = "scheme", column = "scheme")
//    })
//
//    @Select("SELECT * FROM `table`")
//    List<Table> selectAll();
//
//    @Select("SELECT * FROM `table` WHERE id = #{id}")
//    Table selectById(Integer id);
//
//    @Delete("DELETE FROM `table` WHERE id = #{id}")
//    int deleteById(Integer id);
//
//    @Insert("INSERT INTO `table`('scheme') VALUES (#{scheme})")
//    int insert(Table table);
//
//    @Update("UPDATE `table` SET scheme = #{scheme}")
//    int update(Table table);
//}
