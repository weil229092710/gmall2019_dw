package com.atguigu_dw.dwpublisher.mapper;

import java.util.List;
import java.util.Map;

public interface DauMapper {

    public Long getDauTotal(String date);

    public List<Map> getDauHourCount(String date);


}
