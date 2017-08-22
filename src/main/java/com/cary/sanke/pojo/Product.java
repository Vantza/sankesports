package com.cary.sanke.pojo;

import java.util.Date;

public class Product {
    private Integer id;
    private String name;
    private String subtitle;
    private Float orignalprice;
    private Float promoteprice;
    private Integer stock;
    private Integer cid;
    private Date createdate;
    
    
    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }


    public String getSubtitle() {
        return subtitle;
    }


    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }


    public Float getOrignalprice() {
        return orignalprice;
    }


    public void setOrignalprice(Float orignalprice) {
        this.orignalprice = orignalprice;
    }


    public Float getPromoteprice() {
        return promoteprice;
    }


    public void setPromoteprice(Float promoteprice) {
        this.promoteprice = promoteprice;
    }


    public Integer getStock() {
        return stock;
    }


    public void setStock(Integer stock) {
        this.stock = stock;
    }


    public Integer getCid() {
        return cid;
    }


    public void setCid(Integer cid) {
        this.cid = cid;
    }


    public Date getCreatedate() {
        return createdate;
    }


    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}