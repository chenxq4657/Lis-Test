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
 * @since 2019-07-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Usercxq extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String Id;

    @TableField("UserName")
    private String UserName;

    @TableField("RegisterDate")
    private Date RegisterDate;


}
