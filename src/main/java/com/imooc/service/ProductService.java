package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 * @Author wanghl
 * @Date: Created in 17:13 2019/8/19 0019
 */
public interface ProductService {
    ProductInfo findOne(String productId);
    /**客户端查询所有在架商品列表。0在售，1下架**/
    List<ProductInfo> findUpAll();
    /**管理端查询所有商品，需要做分页。当传入分页时，查询返回的是个page对象而不是list。**/
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);

    //    加库存
    void increaseStock(List<CartDTO> cartDTOList);
    //    减库存
    void decreaseStock(List<CartDTO> cartDTOList);
    //    上架
    //    下架
}
