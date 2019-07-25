package com.cn.school.service.mzj.impl;

import com.cn.school.FormView.OrderManageViewForm;
import com.cn.school.entity.mzj.DSOrder;
import com.cn.school.mapper.mzj.OrderManageMapper;
import com.cn.school.service.mzj.OrderManageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class OrderManageServiceImpl implements OrderManageService {


    @Autowired
    OrderManageMapper orderManageMapper;
    /**
     * 删除数据
     *
     * @param form
     * @return
     */
    @Override
    public String deleteOrder(OrderManageViewForm form) {
        DSOrder ds = new DSOrder();
        ds.setOrderId(form.getOrderId());
        Integer i = orderManageMapper.deleteOrder(ds);
        if (i <= 0){
            return "删除失败！";
        } else {
            return "删除成功！";
        }
    }

    /**
     * 添加数据
     *
     * @param form
     * @return
     */
    @Override
    public String addOrder(OrderManageViewForm form) {
        DSOrder ds = new DSOrder();
        ds.setOrderId(form.getOrderId());
        ds.setAddTime(form.getAddTime());
        ds.setAddUser(form.getAddUser());
        ds.setProviderId(form.getProviderId());
        ds.setState(0L);
        Integer i = orderManageMapper.addOrder(ds);
        if (i <= 0){
            return "添加失败！";
        } else {
            return "添加成功！";
        }
    }

    /**
     * 修改数据
     *
     * @param form
     * @return
     */
    @Override
    public String updateOrder(OrderManageViewForm form) {
        DSOrder ds = new DSOrder();
        ds.setOrderId(form.getOrderId());
        ds.setAddTime(form.getAddTime());
        Integer i = orderManageMapper.updateOrder(ds);
        if (i <= 0){
            return "修改失败！";
        } else {
            return "修改成功！";
        }
    }

    /**
     * 通过条件获取数据
     *
     * @param form
     * @return
     */
    @Override
    public List<DSOrder> getOrderInfoByName(OrderManageViewForm form) {
        DSOrder ds = new DSOrder();
        ds.setAddUser(form.getAddUser());
        List<DSOrder> orders = orderManageMapper.getOrderInfoByName(ds);
        return orders;
    }

    /**
     * 获取所有数据
     *
     * @return
     */
    @Override
    public List<DSOrder> getAllOrdersInfo() {
        List<DSOrder> orders = orderManageMapper.getAllOrdersInfo();
        return orders;
    }
}
