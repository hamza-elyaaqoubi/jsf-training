package com.hel.model;


import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean(name = "redirectBean")
public class RedirectBean implements Serializable{

    public String toPage2() {
        return "page";
    }
}
