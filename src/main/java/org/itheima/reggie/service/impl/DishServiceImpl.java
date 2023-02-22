package org.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.itheima.reggie.entity.Category;
import org.itheima.reggie.entity.Dish;
import org.itheima.reggie.mapper.CategoryMapper;
import org.itheima.reggie.mapper.DishMapper;
import org.itheima.reggie.service.CategoryService;
import org.itheima.reggie.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {

}
