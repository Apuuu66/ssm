package com.len.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: Twinkle
 * Time: 2018/2/1 19:36
 */
@Controller
public class UploadImage {
	@RequestMapping(value = "/upload")
	public String upload(MultipartFile picture) throws IOException {
		return "uploadImage";
	}

	@RequestMapping(value = "/uploadpic")
	public String uuu(MultipartFile picture,Model model) throws IOException {
		String filename = picture.getOriginalFilename();
		System.out.println(filename);
		String name = UUID.randomUUID().toString() + filename.substring(filename.lastIndexOf("."));
		System.out.println(name);
		picture.transferTo(new File("D:\\images\\" + name));
		model.addAttribute("pic",name);
		return "success";
	}
}
