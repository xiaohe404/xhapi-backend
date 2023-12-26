package com.xiaohe.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaohe.project.common.ErrorCode;
import com.xiaohe.project.exception.BusinessException;
import com.xiaohe.project.mapper.UserInterfaceInfoMapper;
import com.xiaohe.project.service.UserInterfaceInfoService;
import com.xiaohe.xhapicommon.model.entity.UserInterfaceInfo;
import org.springframework.stereotype.Service;

/**
* @author Lenovo
* @description 针对表【user_userInterface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2023-12-14 14:56:55
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService {

    @Override
    public void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add) {
        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        // 创建时，参数不能为空
        if (add) {
            if (userInterfaceInfo.getUserId() <= 0 || userInterfaceInfo.getInterfaceInfoId() <= 0) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR, "用户或接口不存在");
            }
        }
        if (userInterfaceInfo.getLeftNum() <= 0) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "剩余次数不能小于 0");
        }
    }

    @Override
    public int getLeftNum(long interfaceInfoId, long userId) {
        QueryWrapper<UserInterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("interface_info_id", interfaceInfoId);
        queryWrapper.eq("user_id", userId);
        UserInterfaceInfo userInterfaceInfo = this.getOne(queryWrapper);
        if (userInterfaceInfo == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR);
        }
        Integer leftNum = userInterfaceInfo.getLeftNum();
        if (leftNum == null) {
            throw new BusinessException(ErrorCode.NOT_FOUND_ERROR);
        }
        return leftNum;
    }

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        UpdateWrapper<UserInterfaceInfo> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("interface_info_id", interfaceInfoId);
        updateWrapper.eq("user_id", userId);
        updateWrapper.gt("left_num", 0);
        updateWrapper.setSql("left_num = left_num - 1, total_num = total_num +1");
        return this.update(updateWrapper);
    }
}




