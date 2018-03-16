package com.mappers;

import com.model.DishPhoto;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public interface DishPhotoMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "url", column = "url")
    })

    @Select("SELECT * FROM dishPhoto WHERE dishId = #{id}")
    List<DishPhoto> selectDishPhotos();

    @Select("SELECT * FROM dishPhoto")
    List<DishPhoto> selectAll();

    @Select("SELECT * FROM dishPhoto WHERE id = #{id}")
    DishPhoto selectById(Integer id);

    @Delete("DELETE FROM dishPhoto WHERE id = #{id}")
    int deleteById(Integer id);

    @Insert("INSERT INTO dishPhoto('url') VALUES (#{url})")
    int insert(DishPhoto dishPhoto);

    @Update("UPDATE dishPhoto SET url = #{url}")
    int update(DishPhoto dishPhoto);
}
