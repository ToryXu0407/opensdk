package com.nascent.ecrp.opensdk.openplatformdomain.property;

import lombok.Getter;
import lombok.Setter;

/**
 * Created with IDEA
 * author:ToryXu
 * Date:2018/11/29
 * Time:11:36
 * 属性信息
 */
@Getter
@Setter
public class PropertyInfo {

    /**
     * 唯一编号（Long）
     */
    private Long id;

    /**
     * 属性名称
     */
    private String name;

    /**
     * 该标签在mapping表中查出的值(property_value）
     */
    private String tagArr;

    /**
     * 标签类型 0表示文本框，1表示下拉选择，2表示日期 ， 3 : 单选框 4 ： 复选框（int）
     */
    private Integer tagType;

    /**
     * 当前用户对应的属性值
     */
    private String value;

}
