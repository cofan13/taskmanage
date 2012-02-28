package com.caeit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import com.caeit.vo.Task;

public class TaskDao {
	
	private JdbcTemplate jdbcTemplate;
    
	public List<Task> list(String args[]) {
		return null;
	}
	@Transactional
	public Task show(String args[]){
		Task task = new Task();
		String sql="select * from ptp_task where id=1";
		task=jdbcTemplate.queryForObject(sql, new RowMapper<Task>(){
			public Task mapRow(ResultSet rs, int rowNum) throws SQLException{
				Task tempTask=new Task();
				tempTask.setName(rs.getString("name"));
				tempTask.setDetail(rs.getString("detail"));
				return tempTask;
			}
		});
		return task;
	}
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
}
