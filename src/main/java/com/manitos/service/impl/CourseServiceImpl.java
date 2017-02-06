package com.manitos.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.manitos.entity.Course;
import com.manitos.repository.CourseJpaRepository;
import com.manitos.service.CourseService;

@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService {
	private static final Log LOG = LogFactory.getLog(CourseServiceImpl.class);
	
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRepository;
	
	@Override
	public List<Course> listAllCourse() {
		// TODO Auto-generated method stub
		LOG.info("CALL: listAllCourse()");
		return courseJpaRepository.findAll();
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		LOG.info("CALL: addCourse()");
		return courseJpaRepository.save(course);
	}

	@Override
	public int removeCurse(int id) {
		// TODO Auto-generated method stub
		LOG.info("CALL: removeCurse()");
		courseJpaRepository.delete(id);
		return 0;
	}

	@Override
	public Course updateCurse(Course course) {
		// TODO Auto-generated method stub
		LOG.info("CALL: updateCurse()");
		return courseJpaRepository.save(course);
	}

}
