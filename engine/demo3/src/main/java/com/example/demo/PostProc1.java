package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PostProc1 {
	// Controllerアノテーション指定クラス
	@RequestMapping(value="/call")
	public ModelAndView response(@RequestParam("name") String name, @RequestParam("tweet") String tweet)
	{
		ModelAndView mav = new ModelAndView();
		//mav.setViewName("");
		mav.addObject("helloResponse","Hello. I am " + name + ".");
		mav.addObject("tweetResponse",tweet);
		
		return mav;
	}
}
