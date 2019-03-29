package com.cn.school.dto.forms.stagesmanage;

import com.cn.school.dto.forms.auth.UserContextViewForm;
import lombok.Data;

/**
 * @author:HuMin Date:2019/3/18
 * Time:19:49
 */
@Data
public class GetStagesViewForm extends UserContextViewForm {

    /**
     * 状态
     */
    private Integer status;


    private Long costId;
}
