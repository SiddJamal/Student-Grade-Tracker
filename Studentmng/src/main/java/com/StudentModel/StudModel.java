package com.StudentModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.StudentDao.StudDao;
import com.StudentPojo.StudPojo;

public class StudModel implements StudDao {
	
	static Connection connection= Dbconnection.getConnection();
	

	@Override
	public int insert(StudPojo studPojo) {
		String query="insert into students(name,rollno,department,firstSubject,secondSubject,thirdSubject,fourthSubject) "
				+ "values(?,?,?,?,?,?,?)";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, studPojo.getName());
			preparedStatement.setInt(2, studPojo.getRollno());
			preparedStatement.setString(3, studPojo.getDepartment());
			preparedStatement.setInt(4, studPojo.getFirstSubject());
			preparedStatement.setInt(5, studPojo.getSecontSubject());
			preparedStatement.setInt(6, studPojo.getThirdSubject());
			preparedStatement.setInt(7, studPojo.getFourthSubject());
			
			System.out.println(studPojo.getFirstSubject());
			
			int response = preparedStatement.executeUpdate();
			return response;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<StudPojo> selectAll() {
		ArrayList<StudPojo> list= new ArrayList<StudPojo>();
		String query="select * from students";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
			    String name1=resultSet.getString("name");
			    int rollno=resultSet.getInt("rollno");
			    String department=resultSet.getString("department");
			    int firstSubject=resultSet.getInt("firstSubject");
			    int secondSubject=resultSet.getInt("secondSubject");
			    int thirdSubject=resultSet.getInt("thirdSubject");
			    int fourthSubject=resultSet.getInt("fourthSubject");
			    
			    StudPojo studPojo=new StudPojo(secondSubject, name1, rollno, 
			    		department, firstSubject, firstSubject, thirdSubject, fourthSubject);
			    list.add(studPojo);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public int update(StudPojo studPojo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public StudPojo selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
