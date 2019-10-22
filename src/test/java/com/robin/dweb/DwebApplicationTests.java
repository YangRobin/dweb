package com.robin.dweb;

import com.robin.dweb.document.Item;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DwebApplicationTests {

	@Autowired
	private ElasticsearchTemplate est;

	@Test
	public void contextLoads() {
		est.createIndex(Item.class);
	}

}
