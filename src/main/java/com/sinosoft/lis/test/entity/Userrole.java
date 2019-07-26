package com.sinosoft.lis.test.entity;

import java.util.Date;
import com.sinosoft.lis.test.common.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author cxq
 * @since 2019-07-22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Userrole extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String Id;

    @TableField("UserId")
    private String UserId;

    @TableField("RoleDate")
    private Date RoleDate;


}
