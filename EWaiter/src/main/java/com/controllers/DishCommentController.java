package com.controllers;

import com.dao.DishCommentDao;
import com.google.gson.Gson;
import com.model.DishComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DishCommentController
{
    @Autowired
    private Gson gson;

    @Autowired
    private DishCommentDao dishCommentDao;

    @RequestMapping("/dishComment/selectAll")
    @ResponseBody
    public String selectAll()
    {
        return gson.toJson(dishCommentDao.selectAll());
    }

    @RequestMapping("/dishComment/selectById/{dishCommentId}")
    @ResponseBody
    public String selectById(@PathVariable(value="dishCommentId") int dishCommentId)
    {
        return gson.toJson(dishCommentDao.selectById(dishCommentId));
    }

    @RequestMapping(value ="/dishComment/deleteById/{dishCommentId}",method  = RequestMethod.GET)
    @ResponseBody
    public String deleteById(@PathVariable(value="dishCommentId") int dishCommentId)
    {
        return dishCommentDao.deleteById(dishCommentId)+"";
    }

    @RequestMapping(value="/dishComment/insertDishComment/{json}",method = RequestMethod.GET)
    @ResponseBody
    public String insert(@PathVariable(value="json") String json)
    {
        DishComment dishComment = gson.fromJson(json,DishComment.class);
        return dishCommentDao.insert(dishComment)+"";
    }

    @RequestMapping(value="/dishComment/updateDishComment/{json}",method = RequestMethod.GET)
    @ResponseBody
    public String update(@PathVariable(value="json") String json)
    {
        DishComment dishComment = gson.fromJson(json,DishComment.class);
        return dishCommentDao.update(dishComment)+"";
    }
}
