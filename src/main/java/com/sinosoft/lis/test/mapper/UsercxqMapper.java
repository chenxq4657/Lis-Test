package com.sinosoft.lis.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sinosoft.lis.test.entity.Usercxq;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cxq
 * @since 2019-07-21
 */
public interface UsercxqMapper extends BaseMapper<Usercxq> {
    /**
     * 为了区别plus原来的查询select*的字段 ，自定义为dy
     * @return 多表关联查询
     */
    @Select("SELECT a.id,a.username,b.id roleid FROM usercxq a LEFT JOIN userrole b ON a.id = b.userid where a.id=#{id}")
    List<Map<String, Object>> dyGetUserList(Page<Map<String,Object>> page, @Param("id") String id);
}
