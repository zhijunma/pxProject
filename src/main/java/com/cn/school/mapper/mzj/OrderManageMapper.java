package com.cn.school.mapper.mzj;

import com.cn.school.entity.mzj.DSOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author mzj
 * @date 2019-3-28 上午10:12:11
 */
@Mapper
@Repository
public interface OrderManageMapper {
    /**
     * 删除数据
     * @param ds
     * @return
     */
    Integer deleteOrder(@Param("ds") DSOrder ds);
    /**
     * 添加数据
     * @param ds
     * @return
     */
    Integer addOrder(@Param("ds") DSOrder ds);
    /**
     * 修改数据
     * @param ds
     * @return
     */
    Integer updateOrder(@Param("ds") DSOrder ds);
    /**
     * 通过条件获取数据
     * @param ds
     * @return
     */
    List<DSOrder> getOrderInfoByName(@Param("ds") DSOrder ds);
    /**
     * 获取所有数据
     * @return
     */
    List<DSOrder> getAllOrdersInfo();

}
