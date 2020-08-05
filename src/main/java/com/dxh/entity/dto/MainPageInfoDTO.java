package com.dxh.entity.dto;

import com.dxh.entity.bo.HeadLine;
import com.dxh.entity.bo.ShopCategory;
import lombok.Data;

import java.util.List;

/**
 * @author https://github.com/CoderXiaohui
 * @Description
 * @Date 2020-08-05 23:59
 */
@Data
public class MainPageInfoDTO {
    private List<HeadLine> headLineList;
    private List<ShopCategory> shopCategoryList;
}
