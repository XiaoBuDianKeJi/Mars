package com.xiaobudiankeji.base.entity;

import java.io.Serializable;

/**
 * Created by zuoqing on 2017/12/24.
 */
public class User implements Serializable{

    private int id;

    private String name;

    private int tel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}
