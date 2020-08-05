package com.dxh.controller.frontend;

import com.dxh.entity.dto.MainPageInfoDTO;
import com.dxh.entity.dto.Result;
import com.dxh.service.combine.HeadLineShopCategoryCombineService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author https://github.com/CoderXiaohui
 * @Description
 * @Date 2020-08-06 00:47
 */
public class MainPageController {
    private HeadLineShopCategoryCombineService headLineShopCategoryCombineService;

    public Result<MainPageInfoDTO> getMainPageInfo(HttpServletRequest req, HttpServletResponse resp){
        return headLineShopCategoryCombineService.getMainPageInfo();
    }
}
