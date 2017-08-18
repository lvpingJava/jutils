package com.JUtils;

import com.JUtils.beanConvert.BeanMapConvert;
import com.bean.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lvping on 2017/8/17.
 */
public class TestMain {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("intAge",1231);
        map.put("dubleAge",1231);
        map.put("Longage",1231);
        map.put("dataAge",new Date().getTime());
        Test test=(Test)BeanMapConvert.map2Bean(map, new Test());
        System.out.print(test.getDataAge());
    }
}
