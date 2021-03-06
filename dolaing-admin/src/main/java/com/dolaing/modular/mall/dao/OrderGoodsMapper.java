package com.dolaing.modular.mall.dao;

import com.dolaing.modular.mall.model.OrderGoods;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dolaing.modular.mall.vo.OrderGoodsVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zx
 * @since 2018-08-04
 */
public interface OrderGoodsMapper extends BaseMapper<OrderGoods> {
    List<OrderGoodsVo> queryOrderGoodsByOrderId(Integer orderId);
}
