package com.SingletonDesignPattern;

import java.io.Serializable;

public class C implements Serializable {  
    //your code of singleton  
    protected Object readResolve() {  
        return getC();  
    }  

}  