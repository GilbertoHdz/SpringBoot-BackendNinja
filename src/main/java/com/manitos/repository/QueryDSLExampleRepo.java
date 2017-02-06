package com.manitos.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.manitos.entity.Course;
import com.manitos.entity.QCourse;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQuery;

@Repository("queryDSLExampleRepo")
public class QueryDSLExampleRepo {
	
	private QCourse qCourse = QCourse.course;
	
	@PersistenceContext //Se encuentra en el contexto de la persistencia de la aplicacion
	private EntityManager em; //Gestiona las entidades de la persistencia de la app
	
	public Course find(boolean exist){
		JPAQuery<Course> query = new JPAQuery<Course>(em);
		BooleanBuilder predicateBuilder = new BooleanBuilder(qCourse.description.endsWith("AL"));
		
		if(exist){
			Predicate predicate1 = qCourse.id.eq(23);
			predicateBuilder.and(predicate1);
		}else{
			Predicate predicate2 = qCourse.name.endsWith("NO");
			predicateBuilder.and(predicate2);
		}
		
		return query.select(qCourse).from(qCourse).where(predicateBuilder).fetchOne();
	}
	
}
