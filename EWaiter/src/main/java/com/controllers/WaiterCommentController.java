package com.controllers;

import com.dao.WaiterCommentDao;
import com.google.gson.Gson;
import com.model.WaiterComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WaiterCommentController
{
    @Autowired
    private Gson gson;

    @Autowired
    private WaiterCommentDao waiterCommentDao;

    @RequestMapping("/waiterComment/selectAll")
    @ResponseBody
    public String selectAll()
    {
        return gson.toJson(waiterCommentDao.selectAll());
    }

    @RequestMapping("/waiterComment/selectById/{waiterCommentId}")
    @ResponseBody
    public String selectById(@PathVariable(value="waiterCommentId") int waiterCommentId)
    {
        return gson.toJson(waiterCommentDao.selectById(waiterCommentId));
    }

    @RequestMapping(value ="/waiterComment/deleteById/{waiterCommentId}",method  = RequestMethod.GET)
    @ResponseBody
    public String deleteById(@PathVariable(value="waiterCommentId") int waiterCommentId)
    {
        return waiterCommentDao.deleteById(waiterCommentId)+"";
    }

    @RequestMapping(value="/waiterComment/insertWaiterComment/{json}",method = RequestMethod.GET)
    @ResponseBody
    public String insert(@PathVariable(value="json") String json)
    {
        WaiterComment waiterComment = gson.fromJson(json,WaiterComment.class);
        return waiterCommentDao.insert(waiterComment)+"";
    }

    @RequestMapping(value="/waiterComment/updateWaiterComment/{json}",method = RequestMethod.GET)
    @ResponseBody
    public String update(@PathVariable(value="json") String json)
    {
        WaiterComment waiterComment = gson.fromJson(json,WaiterComment.class);
        return waiterCommentDao.update(waiterComment)+"";
    }
}