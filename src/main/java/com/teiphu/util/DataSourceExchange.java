package com.teiphu.util;

import org.aspectj.lang.JoinPoint;

/**
 * @author TeIphu
 * @data 2018.08.29 15:06
 */
public class DataSourceExchange {

    public void before(JoinPoint point) {

//        //获取目标对象的类类型
//        Class<?> aClass = point.getTarget().getClass();
//
//        //获取包名用于区分不同数据源
//        String whichDataSource = aClass.getName().substring(25, aClass.getName().lastIndexOf("."));
//        if ("ssmone".equals(whichDataSource)) {
//            DataSourceHolder.setDataSources(Constants.DATASOURCE_ONE);
//        } else {
//            DataSourceHolder.setDataSources(Constants.DATASOURCE_TWO);
//        }

    }

    public void after() {
//        DataSourceHolder.setDataSources(null);
    }

}
