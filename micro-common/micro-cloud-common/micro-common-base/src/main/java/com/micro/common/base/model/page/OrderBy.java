/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-26
 */
package com.micro.common.base.model.page;

import java.io.Serializable;
import com.micro.common.base.model.page.ListPage.OrderType;
/**
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
public class OrderBy implements Serializable {


    private static final long serialVersionUID = 6069169626365042071L;

    /**
     * 排序属性
     */
    private String property;

    /**
     * 排序类型，升降序
     */
    private OrderType type;

    public OrderBy() {
        super();
    }

    public OrderBy(String property, String type) {
        super();
        this.property = property;
        if(OrderType.ASCENDING.name().equals(type)
                || OrderType.DESCENDING.name().equals(type)) {
            this.type = OrderType.valueOf(type);
        } else {
            this.type = OrderType.ASCENDING;
        }
    }

    public OrderBy(String property, OrderType type) {
        super();
        this.property = property;
        this.type = type;
    }

    public String getProperty() {
        return property;
    }

    public OrderType getType() {
        return type;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public void setType(OrderType type) {
        this.type = type;
    }
}
