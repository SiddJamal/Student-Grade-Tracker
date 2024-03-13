package com.StudentDao;

import java.util.ArrayList;

import com.StudentPojo.StudPojo;

public interface StudDao {
	
	int insert(StudPojo studPojo);
	
	ArrayList<StudPojo>selectAll();
	
	int update(StudPojo studPojo);
	
	int delete(int id);
	
	StudPojo selectById(int id);

}
