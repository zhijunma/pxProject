package com.cn.school.service.web;

import com.cn.school.dto.forms.costinfo.GetListViewForm;
import com.cn.school.dto.forms.costinfomanage.GetCostManageListViewForm;
import com.cn.school.utils.response.RestResponse;

/**
 * @author:HuMin Date:2019/3/1
 * Time:16:38
 */
public interface CostInfoManageService {

    /**
     * 获取报名信息list
     *
     * @param viewForm
     * @return
     */
    RestResponse getCostInfoList(GetCostManageListViewForm viewForm);

    /**
     * 添加报名费用信息
     *
     * @param viewForm
     * @return
     */
    RestResponse addCostInfo(GetListViewForm viewForm);

    /**
     * 更新报名费用信息
     *
     * @param viewForm
     * @return
     */
    RestResponse updateCostInfo(GetListViewForm viewForm);

    /**
     * 删除报名费用信息
     *
     * @param viewForm
     * @return
     */
    RestResponse deleteCostInfo(GetListViewForm viewForm);
}