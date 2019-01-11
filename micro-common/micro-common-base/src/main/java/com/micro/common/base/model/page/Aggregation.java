/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-26
 */
package com.micro.common.base.model.page;

import lombok.Data;

import java.io.Serializable;

/**
 * SQL聚合函数方法定义
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */

public @Data class Aggregation implements Serializable {

    private static final long serialVersionUID = -1L;


    /**
     * 聚合函数
     */
    public enum AggregateFunction{
        //平均;总和;最小;最大
        AVG,SUM,MIN,MAX;
    }

    /**
     * 聚合类型
     */
    private AggregateFunction fun;

    /**
     * 属性名称
     */
    private String property;

    /**
     * 聚合值
     */
    private Object value;

    public Aggregation(){}

    public Aggregation(AggregateFunction fun, String property) {
        super();
        this.fun = fun;
        this.property = property;
    }

}
