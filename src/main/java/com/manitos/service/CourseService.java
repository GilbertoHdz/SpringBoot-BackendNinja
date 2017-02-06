package com.manitos.service;

import java.util.List;

import com.manitos.entity.Course;

public interface CourseService {
	
	public abstract List<Course> listAllCourse();
	public abstract Course addCourse(Course course);
	public abstract int removeCurse(int id);
	public abstract Course updateCurse(Course course);

}
