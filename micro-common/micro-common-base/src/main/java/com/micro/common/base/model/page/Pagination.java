/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-26
 */
package com.micro.common.base.model.page;

/**
 * 分页抽象接口定义:供实现类或者抽象类进行自定义接口实现
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
public interface Pagination {

    /**
     * all elements size
     */
    public int getAllSize( );

    /**
     * elements size per page
     */
    public int getSize( );

    /**
     * all page size
     */
    public int getAllPage( );

    /**
     * current page number
     */
    public int getNumber( );

    /**
     * is first page
     */
    public boolean isFirst( );

    /**
     * is last page
     */
    public boolean isLast( );

    /**
     * next page number
     */
    public int getNextNumber( );

    /**
     * previous page number
     */
    public int getPreviousNumber( );
}
