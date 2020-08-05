package com.dxh.entity.bo;

import lombok.Data;
import java.util.Date;

/**
 * 头部banner条
 */
@Data
public class HeadLine {
    /**
     * PrimaryKey
     */
    private Long lineId;

    /**
     * 头条名称
     */
    private String lineName;
    /**
     * 头条链接地址
     */
    private String lineLink;
    /**
     * 头条图片
     */
    private String lineImg;
    /**
     * 优先级
     */
    private String priority;
    /**
     * 可用性：0不可用 1可用
     */
    private Integer enableStatus;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 最后修改时间
     */
    private Date lastEditTime;
}
