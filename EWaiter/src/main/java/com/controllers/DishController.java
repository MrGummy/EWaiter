//package com.controllers;
//
//import com.dao.DishDao;
//import com.google.gson.Gson;
//import com.model.Dish;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//public class DishController
//{
//    @Autowired
//    private Gson gson;
//
//    @Autowired
//    private DishDao dishDao;
//
//    @RequestMapping("/dish/selectAll")
//    @ResponseBody
//    public String selectAll()
//    {
//        return gson.toJson(dishDao.selectAll());
//    }
//
//    @RequestMapping("/dish/selectById/{dishId}")
//    @ResponseBody
//    public String selectById(@PathVariable(value="dishId") int dishId)
//    {
//        return gson.toJson(dishDao.selectById(dishId));
//    }
//
//    @RequestMapping(value ="/dish/deleteById/{dishId}",method  = RequestMethod.GET)
//    @ResponseBody
//    public String deleteById(@PathVariable(value="dishId") int dishId)
//    {
//        return dishDao.deleteById(dishId)+"";
//    }
//
//    @RequestMapping(value="/dish/insertDish/{json}",method = RequestMethod.GET)
//    @ResponseBody
//    public String insert(@PathVariable(value="json") String json)
//    {
//        Dish dish = gson.fromJson(json,Dish.class);
//        return dishDao.insert(dish)+"";
//    }
//
//    @RequestMapping(value="/dish/updateDish/{json}",method = RequestMethod.GET)
//    @ResponseBody
//    public String update(@PathVariable(value="json") String json)
//    {
//        Dish dish = gson.fromJson(json,Dish.class);
//        return dishDao.update(dish)+"";
//    }
//}
