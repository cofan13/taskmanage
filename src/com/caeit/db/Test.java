package com.caeit.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.caeit.vo.Task;
public class Test {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		  SessionFactory sessionFactory=(SessionFactory) ctx.getBean("sessionFactory");
	      Session session=sessionFactory.openSession();
		  Transaction ts=null;
		  Task ptpTask =new Task();
		  try {
			 ts=session.beginTransaction();
			 ptpTask=(Task) session.get(Task.class, new Long(22));
			 ptpTask.setDetail("0001230");
			 session.update(ptpTask);
			 ts.commit();
		  } catch (Exception e) {
			 e.printStackTrace();
			 if(ts!=null) ts.rollback();
		  } finally{
			  session.close();
		  }
	}

}
