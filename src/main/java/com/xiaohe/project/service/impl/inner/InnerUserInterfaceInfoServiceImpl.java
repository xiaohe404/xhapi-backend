package com.xiaohe.project.service.impl.inner;

import com.xiaohe.project.service.UserInterfaceInfoService;
import com.xiaohe.xhapicommon.service.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * 内部用户接口关系服务实现类
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    /**
     * 查询接口剩余调用次数
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    @Override
    public int getLeftNum(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.getLeftNum(interfaceInfoId, userId);
    }

    /**
     * 更新接口调用次数
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }
}
