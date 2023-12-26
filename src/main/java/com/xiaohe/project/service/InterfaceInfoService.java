package com.xiaohe.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaohe.xhapicommon.model.entity.InterfaceInfo;

/**
* @author Lenovo
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-12-11 12:12:55
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
