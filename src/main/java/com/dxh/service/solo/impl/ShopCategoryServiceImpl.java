package com.dxh.service.solo.impl;

import com.dxh.entity.bo.HeadLine;
import com.dxh.entity.bo.ShopCategory;
import com.dxh.entity.dto.Result;
import com.dxh.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author https://github.com/CoderXiaohui
 * @Description
 * @Date 2020-08-05 23:56
 */
public class ShopCategoryServiceImpl implements ShopCategoryService {
    @Override
    public Result<Boolean> addShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<Boolean> removeShopCategory(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<Boolean> modifyShopCategory(ShopCategory shopCategory) {
        return null;
    }

    @Override
    public Result<HeadLine> queryShopCategoryById(int shopCategoryId) {
        return null;
    }

    @Override
    public Result<List<HeadLine>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize) {
        return null;
    }
}
