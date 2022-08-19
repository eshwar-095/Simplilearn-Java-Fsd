package com.UserManager.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.UserManager.entity.StudentEntity;


@Repository
public class StudentDao {


	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<StudentEntity> getAllStudent(){
		
		return jdbcTemplate.query("select * from student",new RowMapper<StudentEntity>() {
			
			public StudentEntity mapRow(ResultSet rs, int rowNum) throws SQLException{
				
				StudentEntity obj= new StudentEntity();
				obj.setId(rs.getInt(1));
				obj.setName(rs.getString(2));
				obj.setEmail(rs.getString(3));
				obj.setPassword(rs.getString(4));
				return obj;
			}	
		});
		
		
	}
	public StudentEntity getStudentById(int id) {
		return jdbcTemplate.query("select * from student where id="+id, new ResultSetExtractor<StudentEntity>() {
			
			@Override
			public StudentEntity extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					StudentEntity obj = new StudentEntity();
					obj.setId(rs.getInt(1));
					obj.setName(rs.getString(2));
					obj.setEmail(rs.getString(3));
					obj.setPassword(rs.getString(4));
					return obj;
				}
				return null;
			}
		});
	}
	public int updateProduct(StudentEntity obj) {
		if(obj.getId()>0) {
			String sql= "update student set name=?, email=?, password=? where id=?";
			return jdbcTemplate.update(sql,obj.getName(),obj.getEmail(),obj.getPassword(),obj.getId());
		}
		else {
			String sql= "insert into student (name,email,password) values (?,?,?)";
			return jdbcTemplate.update(sql,obj.getName(),obj.getEmail(),obj.getPassword());
		}
	}
	
	
}
