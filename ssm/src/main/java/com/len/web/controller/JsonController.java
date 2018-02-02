package com.len.web.controller;

import com.len.pojo.Items;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: Twinkle
 * Time: 2018/2/2 0:51
 */
@Controller
public class JsonController {
	//导入jackson 在方法的参数前加上@RequestBody接受json 转成对象
	@RequestMapping(value = "/sendJson")

	public @ResponseBody Items sendJson(@RequestBody Items items) {
		System.out.println(items.toString());
		return items;
	}
}
