package com.atguigu_dw.dwpublisher.mapper;



import com.atguigu_dw.dwpublisher.bean.OrderHourAmount;

import java.util.List;

public interface OrderMapper {

    public  Double  getOrderAmount(String date);

    public List<OrderHourAmount> getOrderHourAmount(String date);

}
