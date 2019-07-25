package com.cn.school.service.mzj;

import com.cn.school.FormView.OrderManageViewForm;
import com.cn.school.entity.mzj.DSOrder;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface OrderManageService {
    /**
     * 删除数据
     * @param form
     * @return
     */
    String deleteOrder(OrderManageViewForm form);
    /**
     * 添加数据
     * @param form
     * @return
     */
    String addOrder(OrderManageViewForm form);
    /**
     * 修改数据
     * @param form
     * @return
     */
    String updateOrder(OrderManageViewForm form);
    /**
     * 通过条件获取数据
     * @param form
     * @return
     */
    List<DSOrder> getOrderInfoByName(OrderManageViewForm form);
    /**
     * 获取所有数据
     * @return
     */
    List<DSOrder> getAllOrdersInfo();
}
