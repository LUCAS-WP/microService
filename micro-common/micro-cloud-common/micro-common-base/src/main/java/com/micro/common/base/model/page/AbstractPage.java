/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-26
 */
package com.micro.common.base.model.page;

import java.io.Serializable;

/**
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
public abstract class AbstractPage implements Pagination, Serializable {

    private static final long serialVersionUID = 1L;


    /**
     * 总大小
     */
    protected int allSize = 0;

    /**
     * 页大小
     */
    protected int size = 0;

    /**
     * 总页数
     */
    protected int total = 0;

    /**
     * 当前页号
     */
    protected int number = 1;


    public AbstractPage( int allSize, int size, int number) {
        super();
        this.allSize = allSize;
        this.size = size;
        this.number = number;
        this.total = allSize <= 0 ? allSize : allSize/size;
        if(allSize != 0 && allSize / size > 0) {
            this.total += 1;
        }
    }

    public AbstractPage( int size, int number) {
        this( 0,size,number );
    }

    public AbstractPage( int size) {
        this( 0,size,1 );
    }

    public AbstractPage( ) {
        super();
    }

    /**
     * 默认页大小
     */
    public abstract int getDefaultSize();


    /**
     * 总页数
     */
    public int getAllPage() {
        if( size < 0 ) {
            return (Math.max(0,allSize)+getDefaultSize()-1)/getDefaultSize();
        }
        if( size == 0 ) {
            return allSize;
        }
        return Math.max(1,(Math.max(0,allSize)+size-1)/size);
    }

    /**
     * 下一页号
     */
    public int getNextNumber() {
        return Math.min( Math.abs(number)+1,getAllPage() );
    }

    /**
     * 上一页号
     */
    public int getPreviousNumber() {
        return Math.max( 1, Math.abs(number)-1 );
    }

    /**
     * 是否第一页
     */
    public boolean isFirst() {
        return number <= 1;
    }

    /**
     * 是否最后一页
     */
    public boolean isLast() {
        return number >= getAllPage();
    }

    /**
     * 当前页在总大小的起始位置
     */
    public int getStart( ){
        int start = (getNumber()-1)*getSize() + 1;
        return Math.max(1, start);
    }

    /**
     * 当前页在总大小的结束位置
     */
    public int getEnd( ){
        return getStart()+getSize();
    }

    public int getAllSize() {
        return allSize;
    }

    public void setAllSize(int allSize) {
        this.allSize = allSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
