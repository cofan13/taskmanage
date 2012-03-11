package com.caeit.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caeit.dao.BasicDao;
import com.caeit.dao.TaskDao;
import com.caeit.vo.Task;

public class TaskService {

	/**
	 * @param args
	 */
	private TaskDao taskDao;
	public void setTaskDao(TaskDao taskDao) {
		this.taskDao=taskDao;
	}
	
	public TaskDao getTaskDao() {
		return taskDao;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		BasicDao<Task> taskDao=(BasicDao<Task>) ctx.getBean("taskDao");
        System.out.println(taskDao.show(2).getDetail());
		
	}

}
