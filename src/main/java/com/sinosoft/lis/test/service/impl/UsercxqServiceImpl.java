package com.sinosoft.lis.test.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sinosoft.lis.test.entity.Usercxq;
import com.sinosoft.lis.test.mapper.UsercxqMapper;
import com.sinosoft.lis.test.service.IUsercxqService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cxq
 * @since 2019-07-21
 */
@Service
public class UsercxqServiceImpl extends ServiceImpl<UsercxqMapper, Usercxq> implements IUsercxqService {


    @Override
    public Page<Map<String,Object>> selectListPage(int current, int number) {

        // 新建分页
        Page<Map<String,Object>> page = new Page<Map<String,Object>>(current, number);

//        Map<String,Object> param = new HashMap<>();
//        param.put("id","2");
        // 返回分页结果 1为id
        return page.setRecords(this.baseMapper.dyGetUserList(page,"2"));

    }
}
