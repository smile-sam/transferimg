package com.zdst.bus.service.impl;

import com.zdst.bus.domain.CheckDangerExtend;
import com.zdst.bus.mapper.CheckDangerExtendMapper;
import com.zdst.bus.service.CheckDangerExtendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sam on 2018/7/28.
 */
@Service
public class CheckDangerExtendServiceImpl implements CheckDangerExtendService {
    @Autowired
    CheckDangerExtendMapper checkDangerExtendMapper;

    @Override
    public List<CheckDangerExtend> queryAll() {
        return checkDangerExtendMapper.queryAll();
    }
}
