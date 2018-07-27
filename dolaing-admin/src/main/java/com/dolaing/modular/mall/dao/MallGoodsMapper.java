package com.dolaing.modular.mall.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.dolaing.modular.mall.model.MallGoods;
import com.dolaing.modular.mall.vo.MallGoodsVo;
import java.util.List;

/**
 * @author zx
 * @since 2018-07-25
 */
public interface MallGoodsMapper extends BaseMapper<MallGoods> {

    /**
     * 查询已上架且在认购期的所有商品
     */
    List<MallGoodsVo> getGoodsList(Pagination page);
}