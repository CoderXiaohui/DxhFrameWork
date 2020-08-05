package com.dxh.service.combine.impl;

import com.dxh.entity.bo.HeadLine;
import com.dxh.entity.bo.ShopCategory;
import com.dxh.entity.dto.MainPageInfoDTO;
import com.dxh.entity.dto.Result;
import com.dxh.service.combine.HeadLineShopCategoryCombineService;
import com.dxh.service.solo.HeadLineService;
import com.dxh.service.solo.ShopCategoryService;

import java.util.List;

/**
 * @author https://github.com/CoderXiaohui
 * @Description
 * @Date 2020-08-06 00:00
 */
public class HeadLineShopCategoryCombineServiceImpl implements HeadLineShopCategoryCombineService {
    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;

    /**
     * 首页需要的数据
     * @return
     */
    @Override
    public Result<MainPageInfoDTO> getMainPageInfo() {
        //1.获取头条列表 (因为是首页，所以查询条件设置为可用的，第1页，显示4条)
        HeadLine headLineCondition = new HeadLine();
        headLineCondition.setEnableStatus(1);
        Result<List<HeadLine>> headLineList = headLineService.queryHeadLine(headLineCondition, 1, 4);
        //2.获取店铺类别列表 (获取所有的ShopCategory.parent为Null的数据，第一页，每页显示100个)
        ShopCategory shopCategoryCondition = new ShopCategory();
        Result<List<HeadLine>> shopCategoryList = shopCategoryService.queryShopCategory(shopCategoryCondition, 1, 100);
        //3.合并并返回
        Result<MainPageInfoDTO> result = mergeMainPageInfoResult(headLineList,shopCategoryList);
        return result;
    }

    private Result<MainPageInfoDTO> mergeMainPageInfoResult(Result<List<HeadLine>> headLineList, Result<List<HeadLine>> shopCategoryList) {
        return null;
    }


}
