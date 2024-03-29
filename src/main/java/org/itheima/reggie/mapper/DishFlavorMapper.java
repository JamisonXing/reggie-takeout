package org.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.itheima.reggie.entity.Dish;
import org.itheima.reggie.entity.DishFlavor;

@Mapper
public interface DishFlavorMapper extends BaseMapper<DishFlavor> {
}
