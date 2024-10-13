package org.example.mapper;

import org.example.entity.SeckillGoods;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SeckillGoodsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(SeckillGoods row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(SeckillGoods row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    SeckillGoods selectByPrimaryKeyWithLock(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    SeckillGoods selectByPrimaryKey(Long id);

    SeckillGoods selectByGoodsID(String goodsID);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(SeckillGoods row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(SeckillGoods row);
}