package org.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.itheima.reggie.common.R;
import org.itheima.reggie.entity.Employee;
import org.itheima.reggie.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    /**
     * 员工登录
     * @param request
     * @param employee
     * @return
     */
    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee) {
        /**
         * 1.将页面提交的密码进行md5加密处理
         * 2.更具页面提交的用户名username查询数据库
         * 3.如果没有查询到则返回登录失败结果
         * 4.密码比对，如果不一致则返回登录失败结果
         * 5.查看员工状态，如果为已禁用状态，则返回员工已禁用结果
         * 6.登陆成功，将员工id存入Session并返回登录成功结果
         */
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<Employee>();
        queryWrapper.eq(Employee::getUsername, employee.getUsername());
        Employee emp = employeeService.getOne(queryWrapper);

        if(emp == null) {
            return R.error("登录失败");
        }

        if(!emp.getPassword().equals(password)) {
            return R.error("登录失败");
        }

        if(emp.getStatus() == 0) {
            return R.error("账号已禁用");
        }

        request.getSession().setAttribute("employee", emp.getId());

        return R.success(emp);
    }
}
