package com.controllers;

import com.dao.MenuDao;
import com.google.gson.Gson;
import com.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuController
{
    @Autowired
    private Gson gson;

    @Autowired
    private MenuDao menuDao;

    @RequestMapping("/menu/selectAll")
    @ResponseBody
    public String selectAll()
    {
        return gson.toJson(menuDao.selectAll());
    }

    @RequestMapping("/menu/selectById/{menuId}")
    @ResponseBody
    public String selectById(@PathVariable(value="menuId") int menuId)
    {
        return gson.toJson(menuDao.selectById(menuId));
    }

    @RequestMapping(value ="/menu/deleteById/{menuId}",method  = RequestMethod.GET)
    @ResponseBody
    public String deleteById(@PathVariable(value="menuId") int menuId)
    {
        return menuDao.deleteById(menuId)+"";
    }

    @RequestMapping(value="/menu/insertMenu/{json}",method = RequestMethod.GET)
    @ResponseBody
    public String insert(@PathVariable(value="json") String json)
    {
        Menu menu = gson.fromJson(json,Menu.class);
        return menuDao.insert(menu)+"";
    }

    @RequestMapping(value="/menu/updateMenu/{json}",method = RequestMethod.GET)
    @ResponseBody
    public String update(@PathVariable(value="json") String json)
    {
        Menu menu = gson.fromJson(json,Menu.class);
        return menuDao.update(menu)+"";
    }
}