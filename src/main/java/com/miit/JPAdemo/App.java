package com.miit.JPAdemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Alien a = new Alien();
//    	a.setAid(7);
//    	a.setAname("Maria");
//    	a.setTech("S/W");
//    	
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	//To fetch data
    	
    	Alien a1 = em.find(Alien.class,4);
    	
    	
    	//To add the record in database
    	//em.getTransaction().begin();
    	//To save data 
    	//em.persist(a);
    	//em.getTransaction().commit();
    	//System.out.println(a);
    	
        
    }
}
