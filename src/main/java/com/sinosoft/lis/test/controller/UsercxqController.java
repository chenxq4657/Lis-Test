package com.sinosoft.lis.test.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sinosoft.lis.test.common.BaseController;
import com.sinosoft.lis.test.entity.Usercxq;
import com.sinosoft.lis.test.service.IUsercxqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cxq
 * @since 2019-07-19
 */
@RestController
@RequestMapping("/test/usercxq")
public class UsercxqController extends BaseController {

    @Autowired
    private IUsercxqService iUsercxqService;

    @RequestMapping("/getById")
    public String getById() {
        return iUsercxqService.getById("1").toString();
    }

    @RequestMapping("/add")
    public Usercxq add() {
        Usercxq t = new Usercxq();
        t.setId(UUID.randomUUID().toString().substring(0,20));
        t.setUserName("2");
        t.setRegisterDate(new Date());
        t.setMakeOperator("2");
        t.setMakeDate(new Date());
        t.setMakeTime("2");
        t.setModifyOperator("2");
        t.setModifyDate(new Date());
        t.setModifyTime("2");
        iUsercxqService.save(t);
        return t;
    }

    @RequestMapping("syscal")
    public Object syscal() {

        Page<Map<String, Object>> page=iUsercxqService.selectListPage(1, 3);

        return page;

    }
}
