package com.caeit.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.caeit.dao.TaskDao;

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
        TaskDao taskDao=(TaskDao) ctx.getBean("taskDao");
        System.out.println(taskDao.show(null).getDetail());
		
	}

}
