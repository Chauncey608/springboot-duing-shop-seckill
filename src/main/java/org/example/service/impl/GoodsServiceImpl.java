package org.example.service.impl;

import org.example.dto.AddGoodsDTO;
import org.example.dto.UpdateGoodsDTO;
import org.example.entity.Goods;
import org.example.entity.GoodsDuing;
import org.example.entity.SeckillGoods;
import org.example.mapper.GoodsDuingMapper;
import org.example.mapper.GoodsMapper;
import org.example.mapper.SeckillGoodsMapper;
import org.example.vo.GoodsDetailVO;
import org.example.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.service.GoodsService;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Autowired
    private GoodsDuingMapper goodsDuingMapper;

    @Autowired
    private SeckillGoodsMapper seckillGoodsMapper;

    @Override
    public List<GoodsVO> getGoods() {
        //通过多表关联一次查出来 还是 每个表单独查询 第一个表查多个数据，从第二个表分别查
        //取决于数据量⬆
        List<GoodsDuing> mapperResultGoodsList = goodsDuingMapper.selectAll();
        List<GoodsVO> resultGoodsVO = new ArrayList<>();
        for (GoodsDuing goodsDuing : mapperResultGoodsList) {
            GoodsVO goodsVO = new GoodsVO();
            SeckillGoods seckillGoodsResult =  seckillGoodsMapper
                    .selectByGoodsID(goodsDuing.getGoodsId());
            goodsVO.setGoodsId(goodsDuing.getGoodsId());
            goodsVO.setGoodsName(goodsDuing.getGoodsName());
            goodsVO.setGoodsType(goodsDuing.getGoodsType());
            goodsVO.setPrice(goodsDuing.getPrice());
            goodsVO.setImgPath(goodsDuing.getImgPath());
            goodsVO.setSecKillPrice(seckillGoodsResult.getSeckillPrice());
            goodsVO.setStockNum(seckillGoodsResult.getStockNum());
            resultGoodsVO.add(goodsVO);
        }
        return resultGoodsVO;
    }

    @Override
    public GoodsDetailVO getGoodsDetail(String goodsId) {
        GoodsDuing goodsDuing = goodsDuingMapper.selectGoodsById(goodsId);
        GoodsDetailVO goodsDetailVO = new GoodsDetailVO();
        SeckillGoods seckillGoodsResult =  seckillGoodsMapper
                .selectByGoodsID(goodsDuing.getGoodsId());
        goodsDetailVO.setGoodsId(goodsDuing.getGoodsId());
        goodsDetailVO.setGoodsName(goodsDuing.getGoodsName());
        goodsDetailVO.setGoodsType(goodsDuing.getGoodsType());
        goodsDetailVO.setPrice(goodsDuing.getPrice());
        goodsDetailVO.setImgPath(goodsDuing.getImgPath());
        goodsDetailVO.setSeckillPrice(seckillGoodsResult.getSeckillPrice());
        goodsDetailVO.setStockNum(seckillGoodsResult.getStockNum());
        goodsDetailVO.setStartTime(seckillGoodsResult.getStartTime());
        goodsDetailVO.setEndTime(seckillGoodsResult.getEndTime());
        return goodsDetailVO;
    }

    @Override
    public int insertGoods(AddGoodsDTO addGoodsDTO) {
        GoodsDuing goods = new GoodsDuing();
        goods.setGoodsId(addGoodsDTO.getGoodsId());
        goods.setGoodsName(addGoodsDTO.getGoodsName());
        goods.setGoodsType(addGoodsDTO.getGoodsType());
        goods.setPrice(addGoodsDTO.getPrice());
        goods.setImgPath(addGoodsDTO.getImgPath());
        return goodsDuingMapper.insert(goods);
    }

    @Override
    public int deleteGoodsByName(String gname) {
        return goodsMapper.deleteByGname(gname);
    }

    @Override
    public int updateGoodsById(UpdateGoodsDTO updateGoodsDTO) {
        GoodsDuing goods = new GoodsDuing();
        goods.setGoodsId(updateGoodsDTO.getGoodsId());
        goods.setGoodsName(updateGoodsDTO.getGoodsName());
        goods.setGoodsType(updateGoodsDTO.getGoodsType());
        goods.setPrice(updateGoodsDTO.getPrice());
        goods.setImgPath(updateGoodsDTO.getImgPath());
        return goodsDuingMapper.updateByPrimaryKey(goods);
    }
}
