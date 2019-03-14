package com.zb.service;

import com.zb.pojo.WfOrder;

import java.util.List;

public interface RpcWfOrderService {

    //查询所有订单
    public List<WfOrder> getWfOrderListByStatus(Integer status);

}
