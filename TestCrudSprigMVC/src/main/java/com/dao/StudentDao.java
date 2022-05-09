package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bean.Student;

public class StudentDao {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insertData(Student student)
	{
		return jdbcTemplate.update("insert into student (sname,city,degree) values('"+student.getSname()+"','"+student.getCity()+"','"+student.getDegree()+"')");
	}
	
	public List<Student> getAllStudent()
	{
		//as list of Student bean
		return jdbcTemplate.query("select * from student", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s1=new Student();
				s1.setSid(rs.getInt(1));
				s1.setSname(rs.getString(2));
				s1.setCity(rs.getString(3));
				s1.setDegree(rs.getString(4));
				return s1;
			}
			
		});
	}
	
	public Student  getSt(int id)
	{
		String sql="select * from student where sid=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, new BeanPropertyRowMapper<Student>(Student.class));
	}
	
	public int  updateStu(Student student)
	{
		return jdbcTemplate.update("update student set sname='"+student.getSname()+"',city='"+student.getCity()+"',degree='"+student.getDegree()+"' where sid='"+student.getSid()+"'");
	}
	
	public int deleteStu(int id)
	{
		return jdbcTemplate.update("delete from student where sid="+id);
	}
}
