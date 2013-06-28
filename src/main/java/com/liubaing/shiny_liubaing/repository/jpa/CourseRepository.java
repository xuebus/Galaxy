package com.liubaing.shiny_liubaing.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liubaing.shiny_liubaing.entity.Course;

/**
 * 类说明:课程DAO接口
 * @author heshuai
 * @version Feb 24, 2012
 *
 * Copyright (c) 2006-2011.Beijing WenHua Online Sci-Tech Development Co. Ltd
 * All rights reserved.
 */
public interface CourseRepository extends JpaRepository<Course, Integer>{

	public List<Course> findByAspIDAndIsCharge(int aspID, int isCharge);
	
}