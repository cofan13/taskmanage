package com.caeit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import com.caeit.vo.Task;

public class TaskDao implements BasicDao<Task>{
	
	private JdbcTemplate jdbcTemplate;
    
	public List<Task> list(String args[]) {
		return null;
	}
	@Transactional
	public Task show(int id){
		Task task = new Task();
		String sql="select * from ptp_task where id="+id;
		task=getJdbcTemplate().queryForObject(sql, new RowMapper<Task>(){
			public Task mapRow(ResultSet rs, int rowNum){
				Task tempTask=new Task();
				try {
					tempTask.setName(rs.getString("name"));
					tempTask.setDetail(rs.getString("detail"));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return tempTask;
			}
		});
		return task;
	}
	
	
	
	@Override
	public void update(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete(int[] args) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate;
	}
	@Override
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
}
