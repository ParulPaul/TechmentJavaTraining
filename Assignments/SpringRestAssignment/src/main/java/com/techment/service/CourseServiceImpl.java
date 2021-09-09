package com.techment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techment.dao.ICourseDao;
import com.techment.entity.Course;

public class CourseServiceImpl implements ICourseService {


/**	
	public List<Course> listAll() 
	{
	return repo.findAll();
	}
	
	
	public void save(Course course ) 
	{
	repo.save(course);
	}
	
	public Course get( int id )
	{
	return repo.findById(id).get();
	}
	
	public void delete(Integer id )
	{
	repo.deleteById(id);
	} 
	
	***/

	@Autowired
	ICourseDao iCourseDao;
	
	@Override
	public List<Course> listAllCourse() {
		// TODO Auto-generated method stub
		return iCourseDao.findAll();
	}

	@Override
	public String addCourse(Course course) {

		iCourseDao.save(course);

		return "Course added Successfully";
	}

	@Override
	public Course viewCourseById(int id) {
		// TODO Auto-generated method stub
		return iCourseDao.findById(id).get();
	}

	@Override
	public String updateCourseById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCourseById(int id) {
		// TODO Auto-generated method stub
		iCourseDao.deleteById(id);
		return "deleted";
	}

	@Override
	public void save(Course course) {
		iCourseDao.save(course);
	}

}
