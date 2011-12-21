package com.caeit.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang.NotImplementedException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.caeit.vo.Category;

@Transactional
public class TestService {
    private JdbcTemplate jdbcTemplate;
	/**
	 * @param args
	 */
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true,timeout=20)
	public Category getCatogray(){
		return (Category)getJdbcTemplate().queryForObject("select * from category", new RowMapper(){
			public Object mapRow(ResultSet rs, int row) throws SQLException{
				Category category=new Category();
				category.setName(rs.getString("name"));
				return category;
			}
		});
	}
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true,timeout=20)
	public Category getCatograyByName(){
		throw new NotImplementedException();
	}
	public JdbcTemplate getJdbcTemplate(){
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		TestService testService=(TestService) context.getBean("testService");
		Category category=testService.getCatogray();
		System.out.println(category.getName());
	}
}
