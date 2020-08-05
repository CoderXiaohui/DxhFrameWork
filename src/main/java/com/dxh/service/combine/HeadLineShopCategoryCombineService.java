package com.dxh.service.combine;

import com.dxh.entity.dto.MainPageInfoDTO;
import com.dxh.entity.dto.Result;

public interface HeadLineShopCategoryCombineService {
    /**
     * 主页所展示的内容
     * @return
     */
    Result<MainPageInfoDTO> getMainPageInfo();
}
