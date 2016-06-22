package com.laviton.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.laviton.model.Property;
import com.laviton.model.Property_Manager_Details;
import com.laviton.model.TennantDetails;
@Repository(value="PropertyDao")
public class PropertyDao {


	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	public void addmeterLogs(Property meterlogs)
	{
		 sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		try{
			 int i=0;
			 tx.begin();
			
			session.save(meterlogs);
			System.out.println("datas added");
			  
			 
			 
			
			 tx.commit();
			   
		}catch (Exception exception) {
			System.out.println(exception);
			if (tx!=null) tx.rollback();
	         exception.printStackTrace(); 

		} finally {
			 session.close();
			sessionFactory.close();
			
		}
	}
	public int getlogs(Property prop){
		ArrayList<Property> property=new ArrayList<Property>();
		Property pr=new Property();
		int id=0;
		//LocalDate now = time.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("in dao");
		if(prop!=null){
		String propertyname=prop.getProperty_name();
		String proprtyaddress=prop.getProperty_address();
		
		 sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Transaction tx = session.getTransaction();
			try{
			tx.begin();
			Criteria criteria = session.createCriteria(Property.class).add(Restrictions.eq("property_name",propertyname)).add(Restrictions.eq("property_address", proprtyaddress));
			
					
			property= (ArrayList<Property>) criteria.list();
			if(property!=null){
			for(Property pr1:property)
			{
			 pr=property.get(0);
			}
		id=pr.getLogin_id();
			System.out.println(property.size());
			tx.commit();
			
			
			}
			else{
				return 0;
			}
			}catch(Exception e){
		System.out.println(e);
		tx.rollback();
	}
			return id;
			
		}
		else return 0;
	}
			
	public Property getlogs(int id1){
		ArrayList<Property> property=new ArrayList<Property>();
		Property pr=new Property();
		int id=0;
		//LocalDate now = time.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println("in dao");
		 sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			Transaction tx = session.getTransaction();
			try{
			tx.begin();
			Criteria criteria = session.createCriteria(Property.class).add(Restrictions.eq("login_id",id1));
			
					
			property= (ArrayList<Property>) criteria.list();
			if(property!=null){
			for(Property pr1:property)
			{
			 pr=property.get(0);
			}
		id=pr.getLogin_id();
			System.out.println(property.size());
			tx.commit();
			
			
			}
			else{
				return null;
			}
			}catch(Exception e){
		System.out.println(e);
		tx.rollback();
	}
			return pr;
			
		
		
	}
			public ArrayList<Property> getList(){
				ArrayList<Property> property=new ArrayList<Property>();
				//LocalDate now = time.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				System.out.println("in dao");
				
				 sessionFactory = new Configuration().configure().buildSessionFactory();
					Session session=sessionFactory.openSession();
					
					Transaction tx = session.getTransaction();
					try{
					tx.begin();
					Criteria criteria = session.createCriteria(Property.class);
					
							
					property=  (ArrayList<Property>) criteria.list();
					
					//System.out.println(property.size());
					tx.commit();
					
					
			}catch(Exception e){
				System.out.println(e);
				tx.rollback();
			}
			
			
		return property;
	}
public void deletetennant(Property tennantdetails)
{
	 sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		try{
			 int i=0;
			 tx.begin();
			
			session.delete(tennantdetails);
			System.out.println("datas deleted");
			  
			 
			 
			
			 tx.commit();
			   
		}catch (Exception exception) {
			System.out.println(exception);
			if (tx!=null) tx.rollback();
	         exception.printStackTrace(); 

		} finally {
			 session.close();
			sessionFactory.close();
			
		}
	
}
public void updatetennant(Property tennantdetails)
{
	 sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		try{
			 int i=0;
			 tx.begin();
			
			session.update(tennantdetails);
			System.out.println("datas deleted");
			  
			 
			 
			
			 tx.commit();
			   
		}catch (Exception exception) {
			System.out.println(exception);
			if (tx!=null) tx.rollback();
	         exception.printStackTrace(); 

		} finally {
			 session.close();
			sessionFactory.close();
			
		}
	
}



}
