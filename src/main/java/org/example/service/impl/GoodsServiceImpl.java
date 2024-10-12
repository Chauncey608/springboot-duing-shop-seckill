package org.example.service.impl;

import org.example.dto.AddGoodsDTO;
import org.example.dto.UpdateGoodsDTO;
import org.example.entity.Goods;
import org.example.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.service.GoodsService;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> getGoods() {
        return goodsMapper.selectAll();
    }

    @Override
    public int insertGoods(AddGoodsDTO addGoodsDTO) {
        Goods goods = new Goods();
        goods.setGname(addGoodsDTO.getGname());
        goods.setId(addGoodsDTO.getId());
        goods.setGprice(addGoodsDTO.getGprice());
        return goodsMapper.insert(goods);
    }

    @Override
    public int deleteGoodsByName(String gname) {
        return goodsMapper.deleteByGname(gname);
    }

    @Override
    public int updateGoodsById(UpdateGoodsDTO updateGoodsDTO) {
        Goods goods = new Goods();
        goods.setId(updateGoodsDTO.getId());
        goods.setGname(updateGoodsDTO.getGname());
        goods.setGprice(updateGoodsDTO.getGprice());
        return goodsMapper.updateByPrimaryKey(goods);
    }
}
