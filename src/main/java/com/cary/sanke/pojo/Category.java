package com.cary.sanke.pojo;

import java.util.List;

public class Category {
    private Integer id;
    private String name;
    List<Product> products;
    List<List<Product>> productsByRow;
    
    /**
     * ��ʾ��дtoString����������ӡCategory�����ʱ�򣬻��ӡ�����ơ�
     */
    public String toString() {
    	return "Category [name=" + name + "]";
    }
     
    public List<Product> getProducts() {
    	return products;
    }
    
    public void setPorducts(List<Product> products) {
    	this.products = products;
    }
    
    public List<List<Product>> getProductsByRow() {
    	return productsByRow;
    }
    
    public void setProductsByRow(List<List<Product>> productsByRow) {
    	this.productsByRow = productsByRow;
    }
    
    
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
}