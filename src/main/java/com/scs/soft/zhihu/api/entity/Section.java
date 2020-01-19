package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author mq_zhou
 * @description TODO
 * @date 2020/1/16 19:47
 */
@Data
@Builder
public class Section {
    private  String sectionId;
    private  String specialId;
    private  String sectionTitle;

}