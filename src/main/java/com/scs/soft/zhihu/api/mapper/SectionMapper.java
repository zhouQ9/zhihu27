package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.entity.Section;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @author mq_zhou
 * @description TODO
 * @date 2020/1/16 19:47
 */
public interface SectionMapper {
    /**
     * 根据专题id查询标签表
     * @param specialId
     * @return
     */

    @Select("select * from t_section where special_id=#{specialId}")
    List<Section> getSectionsBySpecialId(String specialId);
}