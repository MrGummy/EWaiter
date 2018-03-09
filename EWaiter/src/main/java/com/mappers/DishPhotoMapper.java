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

    @Select("SELECT * FROM dishPhoto")
    List<DishPhoto> selectAll();

    @Select("SELECT * FROM dishPhoto WHERE id = #{id}")
    DishPhoto selectById(int id);

    @Delete("DELETE FROM dishPhoto WHERE id = #{id}")
    int deleteById(int id);

    @Insert("INSERT INTO dishPhoto('url') VALUES (#{url})")
    int insert(DishPhoto DishPhoto);

    @Update("UPDATE dishPhoto SET url = #{url}")
    int update(DishPhoto DishPhoto);
}
