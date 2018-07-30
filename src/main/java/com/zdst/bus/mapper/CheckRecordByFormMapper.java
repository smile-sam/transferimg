package com.zdst.bus.mapper;

import com.zdst.bus.domain.CheckRecordByForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by sam on 2018/7/27.
 */
@Mapper
public interface CheckRecordByFormMapper {

    List<CheckRecordByForm> queryAll();
}
