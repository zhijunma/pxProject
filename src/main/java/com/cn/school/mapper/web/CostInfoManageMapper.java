package com.cn.school.mapper.web;

import com.cn.school.entity.DSCostInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:HuMin Date:2019/3/20
 * Time:11:13
 */

@Mapper
@Repository
public interface CostInfoManageMapper {

    /**
     * 学员报名
     *
     * @return
     */
    List<DSCostInfo> getCostInfoList();

}
