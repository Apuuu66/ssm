package com.len.web.controller;

import com.len.pojo.Items;
import com.len.pojo.QueryVo;
import com.len.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Twinkle
 * Time: 2018/1/31 0:17
 */
@Controller
public class ItemsController {
	@Autowired
	private ItemsService itemsService;

	@RequestMapping(value = "/list")
	public ModelAndView itemsList() {
		List<Items> list = itemsService.list();
		ModelAndView itemList = new ModelAndView().addObject("itemList", list);
		itemList.setViewName("itemList");
		return itemList;
	}

	@RequestMapping(value = "/itemEdit/{id}")
	public String itemEdit(@PathVariable("id") Integer id, Model model) {
		Items item = itemsService.findItemById(Integer.parseInt(String.valueOf(id)));
		model.addAttribute("item", item);
		return "editItem";
	}

	@RequestMapping(value = "/updateitem.action")
	public String update(Items items) {
		itemsService.updateItem(items);
		return "success";
	}
	@RequestMapping(value = "queryitem.action")
	public void queryVo(QueryVo vo) {
		System.out.println(vo);
	}
}
