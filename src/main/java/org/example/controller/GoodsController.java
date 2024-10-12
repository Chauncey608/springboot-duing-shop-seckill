package org.example.controller;

import org.example.dto.AddGoodsDTO;
import org.example.dto.UpdateGoodsDTO;
import org.example.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.service.GoodsService;

import java.util.List;
import javax.validation.Valid;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/getGoodsList")
    public List<Goods> getGoods(){
        return goodsService.getGoods();
    }

    @PostMapping("/insertGoods")
    public int insertGoods(@Valid @RequestBody AddGoodsDTO addGoodsDTO){
        return goodsService.insertGoods(addGoodsDTO);
    }

    @GetMapping("/deleteGoods")
    public int deleteGoodsByName(@RequestParam String gname){
        return goodsService.deleteGoodsByName(gname);
    }

    @PostMapping("/updateGoods")
    public int updateGoods(@Valid @RequestBody UpdateGoodsDTO updateGoodsDTO){
        return goodsService.updateGoodsById(updateGoodsDTO);
    }
}
