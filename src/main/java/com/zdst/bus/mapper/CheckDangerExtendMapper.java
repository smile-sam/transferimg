package com.zdst.bus.mapper;

import com.zdst.bus.domain.CheckDangerExtend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by sam on 2018/7/28.
 */
@Mapper
public interface CheckDangerExtendMapper {
    List<CheckDangerExtend> queryAll();
}
