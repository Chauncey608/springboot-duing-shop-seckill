package org.example.service;

import org.example.dto.AddGoodsDTO;
import org.example.dto.UpdateGoodsDTO;
import org.example.vo.GoodsDetailVO;
import org.example.vo.GoodsVO;

import java.util.List;

public interface GoodsService {
    List<GoodsVO> getGoods();

    GoodsDetailVO getGoodsDetail(String goodsId);

    int insertGoods(AddGoodsDTO addGoodsDTO);

    int updateGoodsById(UpdateGoodsDTO updateGoodsDTO);

    void saveToRedis();

    String getFromRedis(String goodsId);
}

