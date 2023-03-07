package org.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.itheima.reggie.entity.Orders;
import org.springframework.stereotype.Service;

public interface OrdersService extends IService<Orders> {
    public void submit(Orders orders);
}
