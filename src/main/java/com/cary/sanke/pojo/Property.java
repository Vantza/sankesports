package com.cary.sanke.pojo;
/**
 * 1. �����ݿ�����ֶ�һһ��Ӧ�Ļ�������
 * 2. ��Category�Ķ��һ��ϵ
 * 3. ��ProductImage��һ�Զ��ϵ
 * 4. firstProductImage������ԣ��Ǵ�productSingleImages������ȡ����һ������������ʾ�����Ʒ��Ĭ��ͼƬ��
 * 5. reviewCount, saleCount �������ֶΣ��ֱ��ʾ�������������������������������ݿ��ж�Ӧ���ֶΡ�
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