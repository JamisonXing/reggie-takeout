package org.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.itheima.reggie.entity.Dish;
import org.itheima.reggie.entity.DishFlavor;
import org.itheima.reggie.mapper.DishFlavorMapper;
import org.itheima.reggie.mapper.DishMapper;
import org.itheima.reggie.service.DishFlavorService;
import org.itheima.reggie.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {

}
