/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-26
 */
package com.micro.common.base.dao;

import com.micro.common.base.utils.StringUtil;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
public class CustomSearchCondition implements Serializable {

    private static final long serialVersionUID = 1L;


    private Set<Condition> terms = new HashSet<Condition>();

    public Set<Condition> toTerms(){
        return this.terms;
    }

    private CustomSearchCondition term(Condition.Type type,String key,Object value ){
        if(StringUtil.clean(key) == null || value == null ) {
            return this;
        }

        Condition term = new Condition( type,key,value);
        terms.add( term );
        return this;
    }

    private CustomSearchCondition term(Condition.Type type,String key ){
        if(StringUtil.clean(key) == null ) {
            return this;
        }

        Condition term = new Condition( type,key,null);
        terms.add( term );
        return this;
    }

    /**
     * 全等
     */
    public CustomSearchCondition equal(String key, Object value) {
        return term( Condition.Type.EQUAL,key,value);
    }

    /**
     * 不等查询
     */
    public CustomSearchCondition notEqual(String key, Object value) {
        return term( Condition.Type.NOT_EQUAL,key,value);
    }

    /**
     * 为空
     */
    public CustomSearchCondition isNull(String key) {
        return term(Condition.Type.NULL,key);
    }

    /**
     * 不为空
     */
    public CustomSearchCondition isNotNull(String key) {
        return term(Condition.Type.NOT_NULL,key);
    }

    /**
     * 小于
     */
    public CustomSearchCondition lessThan(String key, Object value) {
        return term(Condition.Type.LESS_THAN,key,value);
    }

    /**
     * 小于等于
     */
    public CustomSearchCondition lessThanOrEqual(String key, Object value) {
        return term(Condition.Type.LESS_THAN_EQUAL,key,value);
    }

    /**
     * 大于
     */
    public CustomSearchCondition greateThan(String key, Object value) {
        return term(Condition.Type.GREATE_THAN,key,value);
    }

    /**
     * 大于等于
     */
    public CustomSearchCondition greateThanOrEqual(String key, Object value) {
        return term(Condition.Type.GREATE_THAN_EQUAL,key,value);
    }

    /**
     * 包含
     */
    public CustomSearchCondition in(String key, Object ... value) {
        return term(Condition.Type.IN,key,value);
    }

    /**
     * 不包含
     */
    public CustomSearchCondition notIn(String key, Object ... value) {
        return term(Condition.Type.NOT_IN,key,value);
    }

    /**
     * 模糊匹配
     */
    public CustomSearchCondition like(String key, Object value) {
        return term(Condition.Type.LIKE,key,value);
    }
    /**
     * 模糊匹配
     */
    public CustomSearchCondition likeLeft(String key, Object value) {
        return term(Condition.Type.LIKE_LEFT,key,value);
    }
    /**
     * 模糊匹配
     */
    public CustomSearchCondition likeRight(String key, Object value) {
        return term(Condition.Type.LIKE_RIGHT,key,value);
    }

}
