package com.zdst.bus.service.impl;

import com.zdst.bus.domain.CheckRecordByForm;
import com.zdst.bus.mapper.CheckRecordByFormMapper;
import com.zdst.bus.service.CheckRecordByFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sam on 2018/7/27.
 */
@Service
public class CheckRecordByFormServiceImpl implements CheckRecordByFormService {

    @Autowired
    CheckRecordByFormMapper checkRecordByFormMapper;

    @Override
    public List<CheckRecordByForm> queryAll() {
        return checkRecordByFormMapper.queryAll();
    }
}
