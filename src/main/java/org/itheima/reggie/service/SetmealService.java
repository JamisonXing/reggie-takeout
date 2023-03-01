package org.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.itheima.reggie.dto.SetmealDto;
import org.itheima.reggie.entity.Dish;
import org.itheima.reggie.entity.Setmeal;

import java.util.List;
import java.util.Set;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐,同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
