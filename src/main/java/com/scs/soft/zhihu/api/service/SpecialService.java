package com.scs.soft.zhihu.api.service;

import com.scs.soft.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @author mq_zhou
 * @description TODO
 * @date 2020/1/16 20:10
 */
public interface SpecialService {

/**
 * 查询所有专题
 * @return List<Map>
 */
List<Map> selectAll();
/**
 * 查询最新专题
 * @return List<Special>
 */
List<Special> selectRecent();
}

