package com.dxh.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * 商品类别
 */
@Data
public class ShopCategory {
    /**
     * PrimaryKey
     */
    private Long shopCategoryId;
    /**
     * 类别名称
     */
    private String ShopCategoryName;
    /**
     * 类别描述
     */
    private String ShopCategoryDesc;
    /**
     * 类别图片地址
     */
    private String ShopCategoryImg;
    /**
     * 优先级
     */
    private Integer priority;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastEditTime;
    /**
     * 父类别
     */
    private ShopCategory parent;

}
