package com.sinosoft.lis.test.controller;


import com.sinosoft.lis.test.entity.Usercxq;
import com.sinosoft.lis.test.entity.Userrole;
import com.sinosoft.lis.test.service.IUsercxqService;
import com.sinosoft.lis.test.service.IUserroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import com.sinosoft.lis.test.common.BaseController;

import java.util.Date;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cxq
 * @since 2019-07-22
 */
@Controller
@RequestMapping("/test/userrole")
public class UserroleController extends BaseController {

    @Autowired
    private IUserroleService iUserroleService;

    @RequestMapping("/add")
    public Userrole add() {
        Userrole t = new Userrole();
        t.setId(UUID.randomUUID().toString().substring(0,20));
        t.setUserId("2");
        t.setRoleDate(new Date());
        t.setMakeOperator("2");
        t.setMakeDate(new Date());
        t.setMakeTime("2");
        t.setModifyOperator("2");
        t.setModifyDate(new Date());
        t.setModifyTime("2");
        iUserroleService.save(t);
        return t;
    }

}
