package com.robin.dweb.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexCtrl{

  @RequestMapping(value = "/")
  public String index(){
    return "index";
  }
}