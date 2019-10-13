package com.robin.dweb.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexCtrl{

  @RequestMapping(value = "/")
  public String index(){
    int age=33;
    return "index";
  }
}