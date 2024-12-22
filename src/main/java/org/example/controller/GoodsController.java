package org.example.controller;

import org.example.dto.AddGoodsDTO;
import org.example.dto.UpdateGoodsDTO;
import org.example.vo.GoodsDetailVO;
import org.example.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.service.GoodsService;

import java.util.List;
import javax.validation.Valid;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/redisTest")
    public void redisTest(){
        goodsService.saveToRedis();
    }

    @GetMapping("/getGoodsList")
    public List<GoodsVO> getGoods(){
        return goodsService.getGoods();
    }

    @GetMapping("/getGoodsDetail/{goodsId}")
    public GoodsDetailVO getGoodsDetail(@PathVariable String goodsId){
        return goodsService.getGoodsDetail(goodsId);
    }

    @PostMapping("/insertGoods")
    public int insertGoods(@Valid @RequestBody AddGoodsDTO addGoodsDTO){
        return goodsService.insertGoods(addGoodsDTO);
    }

//    @GetMapping("/deleteGoods")
//    public int deleteGoodsByName(@RequestParam String gname){
//        return goodsService.deleteGoodsByName(gname);
//    }

    @PostMapping("/updateGoods")
    public int updateGoods(@Valid @RequestBody UpdateGoodsDTO updateGoodsDTO){
        return goodsService.updateGoodsById(updateGoodsDTO);
    }

    @GetMapping("/saveToRedis")
    public void saveToRedis(){
        goodsService.saveToRedis();
    }

    @GetMapping("/getFromRedis/{goodsId}")
    public String getFromRedis(@PathVariable String goodsId){
        return goodsService.getFromRedis(goodsId);
    }
}
