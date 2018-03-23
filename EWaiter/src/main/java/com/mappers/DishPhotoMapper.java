//package com.mappers;
//
//import com.model.DishPhoto;
//import org.apache.ibatis.annotations.*;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//
//@Service
//public interface DishPhotoMapper {
//    @Results({
//            @Result(property = "id", column = "id"),
//            @Result(property = "url", column = "url")
//    })
//
//    @Select("SELECT * FROM dishphoto WHERE dishId = #{id}")
//    List<DishPhoto> selectDishPhotos();
//
//    @Select("SELECT * FROM dishphoto")
//    List<DishPhoto> selectAll();
//
//    @Select("SELECT * FROM dishphoto WHERE id = #{id}")
//    DishPhoto selectById(Integer id);
//
//    @Delete("DELETE FROM dishphoto WHERE id = #{id}")
//    int deleteById(Integer id);
//
//    @Insert("INSERT INTO dishphoto('url') VALUES (#{url})")
//    int insert(DishPhoto dishPhoto);
//
//    @Update("UPDATE dishphoto SET url = #{url}")
//    int update(DishPhoto dishPhoto);
//}
