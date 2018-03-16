package com.controllers;

import com.dao.WaiterDao;
import com.google.gson.Gson;
import com.model.Waiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WaiterController
{
    @Autowired
    private Gson gson;

    @Autowired
    private WaiterDao waiterDao;

    @RequestMapping("/waiter/selectAll")
    @ResponseBody
    public String selectAll()
    {
        return gson.toJson(waiterDao.selectAll());
    }

    @RequestMapping("/waiter/selectById/{waiterId}")
    @ResponseBody
    public String selectById(@PathVariable(value="waiterId") int waiterId)
    {
        return gson.toJson(waiterDao.selectById(waiterId));
    }

    @RequestMapping(value ="/waiter/deleteById/{waiterId}",method  = RequestMethod.GET)
    @ResponseBody
    public String deleteById(@PathVariable(value="waiterId") int waiterId)
    {
        return waiterDao.deleteById(waiterId)+"";
    }

    @RequestMapping(value="/waiter/insertWaiter/{json}",method = RequestMethod.GET)
    @ResponseBody
    public String insert(@PathVariable(value="json") String json)
    {
        Waiter waiter = gson.fromJson(json,Waiter.class);
        return waiterDao.insert(waiter)+"";
    }

    @RequestMapping(value="/waiter/updateWaiter/{json}",method = RequestMethod.GET)
    @ResponseBody
    public String update(@PathVariable(value="json") String json)
    {
        Waiter waiter = gson.fromJson(json,Waiter.class);
        return waiterDao.update(waiter)+"";
    }
}