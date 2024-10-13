package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.entity.GoodsDuing;

import java.util.List;

@Mapper
public interface GoodsDuingMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(GoodsDuing row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(GoodsDuing row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    GoodsDuing selectByPrimaryKeyWithLock(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    GoodsDuing selectByPrimaryKey(Long id);

    List<GoodsDuing> selectAll();

    GoodsDuing selectGoodsById(String goodsId);

//    List<GoodsVO> selectFromGoodsAndSeckillByGoodsID(String goodsID);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(GoodsDuing row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(GoodsDuing row);
}