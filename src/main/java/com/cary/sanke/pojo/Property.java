package com.cary.sanke.pojo;
/**
 * 1. 与数据库相关字段一一对应的基本属性
 * 2. 与Category的多对一关系
 * 3. 与ProductImage的一对多关系
 * 4. firstProductImage这个属性，是从productSingleImages集合中取出第一个来，用于显示这个产品的默认图片。
 * 5. reviewCount, saleCount 这两个字段，分别表示评价数量和销售数量，并不是在数据库中对应的字段。
 * @author cary.cao
 *
 */
public class Property {
    private Integer id;
    private Integer cid;
    private String name;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getCid() {
        return cid;
    }


    public void setCid(Integer cid) {
        this.cid = cid;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}