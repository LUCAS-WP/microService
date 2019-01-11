/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-26
 */
package com.micro.common.base.entity;

/**
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
public interface Insertable {


    /**
     * 插入之前所做的操作
     */
    void preInsert( );

    /**
     * 插入失败所做的操作
     */
    void postInsertFailure( );

    /**
     * 判断是否插入值
     */
    boolean isInsert( );
}
