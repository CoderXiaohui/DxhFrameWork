package com.dxh.controller.frontend.superadmin;

import com.dxh.entity.bo.HeadLine;
import com.dxh.entity.bo.ShopCategory;
import com.dxh.entity.dto.Result;
import com.dxh.service.solo.ShopCategoryService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author https://github.com/CoderXiaohui
 * @Description
 * @Date 2020-08-06 00:53
 */
public class ShopCategoryOperationController {
    private ShopCategoryService shopCategoryService;

    public Result<Boolean> addShopCategory(HttpServletRequest req, HttpServletResponse resp){
        //TODO：参数校验、请求参数转化
        return shopCategoryService.addShopCategory(new ShopCategory());
    }

    public Result<Boolean> removeShopCategory(HttpServletRequest req, HttpServletResponse resp){
        //TODO：参数校验、请求参数转化
        return shopCategoryService.removeShopCategory(1);
    }

    public Result<Boolean> modifyShopCategory(HttpServletRequest req, HttpServletResponse resp){
        //TODO：参数校验、请求参数转化
        return shopCategoryService.modifyShopCategory(new ShopCategory());
    }

    public Result<HeadLine> queryShopCategoryById(HttpServletRequest req, HttpServletResponse resp){
        //TODO：参数校验、请求参数转化
        return shopCategoryService.queryShopCategoryById(1);
    }

    public Result<List<HeadLine>> queryShopCategory(HttpServletRequest req, HttpServletResponse resp){
        //TODO：参数校验、请求参数转化
        return shopCategoryService.queryShopCategory(null,1,100);
    }
}
