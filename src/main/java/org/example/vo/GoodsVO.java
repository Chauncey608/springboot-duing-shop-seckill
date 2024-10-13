package org.example.vo;

import lombok.Data;

/**
 * vo = view object
 * 为了区分数据库的表结构 和 页面的展示数据结构 而出现
 * vo可能随着需求的变换而变化 但数据库表结构一般不轻易变
 */
@Data
public class GoodsVO {
    /**
     * Column: goods_id
     * Type: VARCHAR(100)
     * Remark: 商品ID
     */
    private String goodsId;

    /**
     * Column: goods_name
     * Type: VARCHAR(100)
     * Remark: 商品名字
     */
    private String goodsName;

    /**
     * Column: goods_type
     * Type: VARCHAR(100)
     * Remark: 商品类别
     */
    private String goodsType;

    /**
     * Column: price
     * Type: DOUBLE
     * Remark: 商品价格
     */
    private Double price;

    /**
     * Column: img_path
     * Type: VARCHAR(200)
     * Remark: 商品图片地址
     */
    private String imgPath;

    private Double secKillPrice;

    private int stockNum;

}
