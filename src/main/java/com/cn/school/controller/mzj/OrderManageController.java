package com.cn.school.controller.mzj;

import com.cn.school.FormView.OrderManageViewForm;
import com.cn.school.entity.mzj.DSOrder;
import com.cn.school.service.mzj.OrderManageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(description = "订单管理",tags = {"订单管理"})
@ApiModel(value="订单管理",description="订单管理")
@RequestMapping("/order")
public class OrderManageController {
    @Autowired
    OrderManageService orderManageService;
    /**
     * 添加订单
     * @param form
     * @return
     */
    @ApiOperation(value = "添加订单")
    @PostMapping(value = "/add")
    public String addOrder(OrderManageViewForm form) {
        return orderManageService.addOrder(form);
    }
    /**
     * 获取所有
     * @return
     */
    @ApiOperation(value = "获取所有")
    @PostMapping(value = "/getAll")
    public List<DSOrder> getAllOrder() {
        return orderManageService.getAllOrdersInfo();
    }
    /**
     *删除
     * @param form
     * @return
     */
    @ApiOperation(value = "删除")
    @PostMapping(value = "/delete")
    public String deleteOrder(OrderManageViewForm form) {
        return orderManageService.deleteOrder(form);
    }
    /**
     *修改
     * @param form
     * @return
     */
    @ApiOperation(value = "修改")
    @PostMapping(value = "/update")
    public String updateOrder(OrderManageViewForm form) {
        return orderManageService.updateOrder(form);
    }
    /**
     *查询
     * @param form
     * @return
     */
    @PostMapping(value = "/get")
    @ApiOperation(value = "查询")
    public List<DSOrder> getOrderByName(OrderManageViewForm form) {
        return orderManageService.getOrderInfoByName(form);
    }

}
