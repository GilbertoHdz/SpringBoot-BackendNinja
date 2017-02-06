package com.manitos.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.manitos.entity.Course;
import com.manitos.model.CourseModel;
import com.manitos.service.impl.CourseServiceImpl;

@Controller
@RequestMapping("/courses")
public class CourseController {

	private static final String COURSES_VIEW = "courses";
	private static final Log LOG = LogFactory.getLog(CourseController.class);
	
	
	@Autowired
	@Qualifier("courseServiceImpl")
	private CourseServiceImpl courseServiceImpl;
	
	@GetMapping("/listCourses")
	public ModelAndView listAllCourses(){
		LOG.info("CALL: listAllCourses()");
		ModelAndView mav = new ModelAndView(COURSES_VIEW);
		mav.addObject("course", new Course());
		mav.addObject("courses", courseServiceImpl.listAllCourse());
		return mav;
	}
	
	@PostMapping("/addcourse")
	public String addCourse(@ModelAttribute("course") Course course){
		LOG.info("CALL: addCourse()  -- PARAM: " + course.toString());
		courseServiceImpl.addCourse(course);
		return "redirect:/courses/listCourses";
	}
	
}
