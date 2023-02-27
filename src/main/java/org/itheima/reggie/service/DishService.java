package org.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.itheima.reggie.dto.DishDto;
import org.itheima.reggie.entity.Dish;

public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，需要操作系统两张表：dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //按照id查询菜品信息和对应口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息同时更新口味信息
    public void updateWithFlavor(DishDto dishDto);
}
