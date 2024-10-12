package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface GoodsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    int deleteByGname(String gname);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Goods row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Goods row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Goods selectByPrimaryKeyWithLock(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Goods selectByPrimaryKey(Integer id);

    /**
     * @return 返回所有商品
     */
    List<Goods> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Goods row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Goods row);
}