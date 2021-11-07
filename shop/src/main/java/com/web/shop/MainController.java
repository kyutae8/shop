package com.web.shop;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.shop.dto.ShopUserInfoDTO;

@Controller
public class MainController {
	
	@RequestMapping(value = "/main",method = RequestMethod.GET)
	public String goMain() {
		return "index";
	}
	@RequestMapping(value = "/main",method = RequestMethod.POST)
	public Map<String,Object> goMa(ShopUserInfoDTO shopUserInfoDTO) {
		Map<String,Object> map = new HashMap<String, Object>();
		System.out.println(shopUserInfoDTO.getUserNo());
		map.put("userNo",shopUserInfoDTO.getUserNo());
		return map;
	}
}
