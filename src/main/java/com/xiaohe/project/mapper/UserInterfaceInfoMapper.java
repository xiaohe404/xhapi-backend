package com.xiaohe.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaohe.xhapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author Lenovo
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-12-16 18:44:09
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    /**
     * 统计接口调用次数 topN
     * @param i
     * @return
     */
    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int i);
}




