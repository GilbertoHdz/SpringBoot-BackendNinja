package com.manitos.converter;

import org.springframework.stereotype.Component;

import com.manitos.entity.Course;
import com.manitos.model.CourseModel;

@Component("courseConverter")
public class CourseConverter {
	
	//Entity -> Model
	public CourseModel entityToModel(Course course){
		CourseModel courseModel = new CourseModel();
		courseModel.setName(course.getName());
		courseModel.setDescription(course.getDescription());
		courseModel.setHours(course.getHours());
		courseModel.setPrice(course.getPrice());
		
		return courseModel;
	}
	
	//Model -> Entity
	public Course entityToModel(CourseModel courseModel){
		Course course = new Course();
		course.setName(courseModel.getName());
		course.setDescription(courseModel.getDescription());
		course.setHours(courseModel.getHours());
		course.setPrice(courseModel.getPrice());
		
		return course;
	}

}
