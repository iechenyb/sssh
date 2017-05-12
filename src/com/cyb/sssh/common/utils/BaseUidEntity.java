package com.cyb.sssh.common.utils;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")  
@MappedSuperclass  
public class BaseUidEntity implements Serializable,Cloneable{  
  
    @Id  
    @GenericGenerator(name="uu_id", strategy="uuid")  
    @GeneratedValue(generator="uu_id")  
    private String id;  
  
    public String getId() {  
        return id;  
    }  
  
    public void setId(String id) {  
        this.id = id;  
    }  
  
    public Object clone()  
    {  
        Object o=null;  
        try  
        {  
            o=(Object)super.clone();  
        }  
        catch(CloneNotSupportedException e)  
        {  
            System.out.println(e.toString());  
        }  
        return o;  
    }  
  
          
      
}  