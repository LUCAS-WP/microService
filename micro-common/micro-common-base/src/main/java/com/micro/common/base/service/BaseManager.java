/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-27
 */
package com.micro.common.base.service;

import com.micro.common.base.dao.Condition;
import com.micro.common.base.dao.CustomSearchCondition;
import com.micro.common.base.entity.Persistence;
import com.micro.common.base.model.page.ListPage;

import java.io.Serializable;
import java.util.Collection;

/**
 * 持久层基类
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
public interface BaseManager<T extends Persistence<?>> extends Manager {


    /**
     * read
     */
    public T get( T t );

    /**
     * read
     */
    public T get( Serializable identity );

    /**
     * read with lock
     */
    public T getWithLock( Serializable identity );

    /**
     * read with lock
     */
    public T getWithLock( T t );

    /**
     * create
     */
    public void create( T t );

    /**
     * create all
     */
    public void create( Collection<T> entities );

    /**
     * update
     */
    public void update( T t );

    /**
     * update all
     */
    public void update( Collection<T> entities );

    /**
     * create or update
     */
    public void save( T t );

    /**
     * create or update all
     */
    public void save( Collection<T> entities );

    /**
     * delete
     */
    public void remove( T t );

    /**
     * delete all
     */
    public void remove( Collection<T> entities );

    /**
     * delete
     */
    public void remove( Serializable identity );

    /**
     * 分页查询
     */
    public ListPage<T> list(ListPage<T> page );

    /**
     * 带条件的分页查询
     */
    public ListPage<T> list(ListPage<T> page,T t );


    /**
     * 带条件的分页查询
     */
    public ListPage<T> list( ListPage<T> page,Collection<Condition> terms );

    /**
     * 带条件的分页查询
     */
    public ListPage<T> list(ListPage<T> page, CustomSearchCondition sc );

    /**
     * 检查属性是否唯一
     * 属性通过 JPA 注解定义
     */
    public boolean isUniqueProperty(T t);

    /**
     * 检查属性是否唯一
     * @param property 属性名
     * @return 属性唯一返回true
     */
    public boolean isUniqueProperty(String property,T t);
}
