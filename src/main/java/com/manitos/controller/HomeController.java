package com.manitos.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
	
	private static final Log LOGGER = LogFactory.getLog(HomeController.class);
	public static final String HOME_VIEW = "Home";
	
	//Primera forma, redirecciones sin datos o pocos datos
	@GetMapping("homeStr")// = @RequestMapping(value="homeStr", method=RequestMethod.GET)
	public String homeStr(){
		
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG TRACE");
		
		return HOME_VIEW;
	}
	
	//Segunda forma, como para insertar muchos datos
	@GetMapping("homeMv")
	public ModelAndView homeMv(){
		return new ModelAndView(HOME_VIEW);
	}
	
}
