//package com.controllers;
//
//import com.dao.DishPhotoDao;
//import com.google.gson.Gson;
//import com.model.DishPhoto;
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
//public class DishPhotoController
//{
//    @Autowired
//    private Gson gson;
//
//    @Autowired
//    private DishPhotoDao dishPhotoDao;
//
//    @RequestMapping("/dishPhoto/selectAll")
//    @ResponseBody
//    public String selectAll()
//    {
//        return gson.toJson(dishPhotoDao.selectAll());
//    }
//
//    @RequestMapping("/dishPhoto/selectById/{dishPhotoId}")
//    @ResponseBody
//    public String selectById(@PathVariable(value="dishPhotoId") int dishPhotoId)
//    {
//        return gson.toJson(dishPhotoDao.selectById(dishPhotoId));
//    }
//
//    @RequestMapping(value ="/dishPhoto/deleteById/{dishPhotoId}",method  = RequestMethod.GET)
//    @ResponseBody
//    public String deleteById(@PathVariable(value="dishPhotoId") int dishPhotoId)
//    {
//        return dishPhotoDao.deleteById(dishPhotoId)+"";
//    }
//
//    @RequestMapping(value="/dishPhoto/insertDishPhoto/{json}",method = RequestMethod.GET)
//    @ResponseBody
//    public String insert(@PathVariable(value="json") String json)
//    {
//        DishPhoto dishPhoto = gson.fromJson(json,DishPhoto.class);
//        return dishPhotoDao.insert(dishPhoto)+"";
//    }
//
//    @RequestMapping(value="/dishPhoto/updateDishPhoto/{json}",method = RequestMethod.GET)
//    @ResponseBody
//    public String update(@PathVariable(value="json") String json)
//    {
//        DishPhoto dishPhoto = gson.fromJson(json,DishPhoto.class);
//        return dishPhotoDao.update(dishPhoto)+"";
//    }
//}
