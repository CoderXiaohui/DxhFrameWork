package com.dxh.service.solo;

import com.dxh.entity.bo.HeadLine;
import com.dxh.entity.bo.ShopCategory;
import com.dxh.entity.dto.Result;

import java.util.List;

public interface ShopCategoryService {
    Result<Boolean> addShopCategory(ShopCategory shopCategory);

    Result<Boolean> removeShopCategory(int shopCategoryId);

    Result<Boolean> modifyShopCategory(ShopCategory shopCategory);

    Result<HeadLine> queryShopCategoryById(int shopCategoryId);

    Result<List<HeadLine>> queryShopCategory(ShopCategory shopCategoryCondition, int pageIndex, int pageSize);
}
