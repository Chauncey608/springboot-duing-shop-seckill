package org.example.service;

import org.example.dto.AddGoodsDTO;
import org.example.dto.UpdateGoodsDTO;
import org.example.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getGoods();

    int insertGoods(AddGoodsDTO addGoodsDTO);

    int deleteGoodsByName(String gname);

    int updateGoodsById(UpdateGoodsDTO updateGoodsDTO);
}
