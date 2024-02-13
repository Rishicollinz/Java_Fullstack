package com.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.model.Student;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setId(rs.getInt("id"));
		s.setSname(rs.getString("sname"));
		s.setCourse(rs.getString("course"));
		s.setFee(rs.getDouble("fee"));
		return s;
	}

}
