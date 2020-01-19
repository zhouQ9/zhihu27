package com.scs.soft.zhihu.api.mapper;

import com.scs.soft.zhihu.api.ZhihuApiApplication;
import com.scs.soft.zhihu.api.entity.Special;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author mq_zhou
 * @description TODO
 * @date 2020/1/19 16:41
 */
@SpringBootTest(classes = ZhihuApiApplication.class)
class SpecialMapperTest {

    @Resource
    private  SpecialMapper specialMapper;

    @Test
    void selectRecent() {
        List<Special> specialList=specialMapper.selectRecent();
        specialList.forEach(System.out::println);
    }

    @Test
    void selectAll() {
    }
}