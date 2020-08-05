package com.dxh.entity.dto;

import lombok.Data;

/**
 * @author https://github.com/CoderXiaohui
 * @Description
 * @Date 2020-08-05 23:47
 */
@Data
public class Result<T> {
    /**
     * 本次请求状态码，200表示成功
     */
    private int code;

    /**
     * 本次请求的详情
     */
    private String msg;

    /**
     * 本次请求的返回结果集
     */
    private T data;
}
