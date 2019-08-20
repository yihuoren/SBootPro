package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品
 * @Author wanghl
 * @Date: Created in 15:55 2019/8/19 0019
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    /**根据商品状态，查询在架商品**/
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
