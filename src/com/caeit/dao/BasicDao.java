package com.caeit.dao;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public interface BasicDao<T> {
	public T show(int id);
	public List<T> list(String args[]);
    public void update(int id);
    public void delete(int args[]);
    public JdbcTemplate getJdbcTemplate();
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate);
}
