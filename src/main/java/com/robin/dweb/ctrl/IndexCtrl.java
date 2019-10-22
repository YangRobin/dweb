package com.robin.dweb.ctrl;

import com.robin.dweb.document.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexCtrl{

  @Autowired
  private ElasticsearchTemplate est;

  @RequestMapping(value = "/")
  public String index(){
    System.out.print("helo");
    est.createIndex(Item.class);
    return "index";
  }

  @RequestMapping(value = "/test")
  public String test(){

    return  "test";
  }
}