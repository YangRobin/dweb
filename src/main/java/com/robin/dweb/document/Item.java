package com.robin.dweb.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "item",type = "docs", shards = 1, replicas = 0 )
public class Item{
  @Id
  private int id;
  @Field(type = FieldType.Keyword)
  private String name;
  @Field(type = FieldType.Integer)
  private int prize;
  @Field(type = FieldType.Keyword)
  private String desc;
}