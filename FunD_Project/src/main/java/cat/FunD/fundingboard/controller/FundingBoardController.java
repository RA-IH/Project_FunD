package cat.FunD.fundingboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/fundingBoard/*")
@AllArgsConstructor
public class FundingBoardController {
	
	// 카테고리 이동
		@GetMapping(value = "/category")
		public String category(){
			return "/fundingBoard/category";
		}
		
	// 프로젝트 생성 페이지 이동
		@GetMapping(value = "/projectForm")
		public String writeForm(){
			//model.addAttribute("category", service.getAllCategory());
			//setPageMaker(cri, model);
			return "/fundingBoard/projectForm";
		}

}
