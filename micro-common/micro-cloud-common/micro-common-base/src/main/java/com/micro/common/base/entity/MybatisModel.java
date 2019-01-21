/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-26
 */
package com.micro.common.base.entity;

import java.io.Serializable;

/**
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
public abstract class MybatisModel <ID extends Serializable> implements Persistence<ID> {

    public abstract ID getIdentity();

    public void preInsert() {

    }

    public void postInsertFailure() {

    }

    public boolean isInsert() {
        return false;
    }
}
