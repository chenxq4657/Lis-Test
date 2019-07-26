package com.sinosoft.lis.test.common;

import lombok.Data;

import java.util.Date;

/**
 * Created by cxq on 2019/7/15.
 */
@Data
public class BaseEntity {

    private String makeOperator;

    private Date makeDate;

    private String makeTime;

    private String modifyOperator;

    private Date modifyDate;

    private String modifyTime;
}
