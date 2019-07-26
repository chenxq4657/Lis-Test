package com.sinosoft.lis.test.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sinosoft.lis.test.entity.Usercxq;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cxq
 * @since 2019-07-21
 */
public interface IUsercxqService extends IService<Usercxq> {



    Page<Map<String,Object>> selectListPage(int current, int number);


}
