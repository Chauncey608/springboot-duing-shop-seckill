package org.example.vo;

import lombok.Data;

import java.util.Date;

//展示商品详情数据
@Data
public class GoodsDetailVO {
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

    /**
     * Column: seckill_price
     * Type: DOUBLE
     * Remark: 秒杀价格
     */
    private Double seckillPrice;

    /**
     * Column:  stock_num
     * Type: INT
     * Remark: 秒杀库存
     */
    private Integer stockNum;

    /**
     * Column: start_time
     * Type: DATETIME
     * Remark: 秒杀开始时间
     */
    private Date startTime;

    /**
     * Column: end_time
     * Type: DATETIME
     * Remark: 秒杀结束时间
     */
    private Date endTime;

}
