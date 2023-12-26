package com.xiaohe.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaohe.xhapicommon.model.entity.UserInterfaceInfo;

/**
* @author Lenovo
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-12-14 14:56:55
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * 参数校验
     * @param userInterfaceInfo
     * @param b
     */
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean b);

    /**
     * 获取接口剩余调用次数
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    int getLeftNum(long interfaceInfoId, long userId);

    /**
     * 更新接口调用次数
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
