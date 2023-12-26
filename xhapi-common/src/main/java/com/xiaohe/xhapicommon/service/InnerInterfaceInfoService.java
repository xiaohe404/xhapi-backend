package com.xiaohe.xhapicommon.service;

import com.xiaohe.xhapicommon.model.entity.InterfaceInfo;

/**
* @author Lenovo
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-12-11 12:12:55
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在（请求路径、请求方法、请求参数）
     * @param url
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String url, String method);

}
