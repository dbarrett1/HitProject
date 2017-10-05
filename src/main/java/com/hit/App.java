package com.hit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hit.domain.SongWriterImpl;
import com.hit.domain.Venue;
import com.hit.interfaces.Songwriter;
public class App {

	private static ApplicationContext context;	
	public static void main (String args[]){
		
	context=new ClassPathXmlApplicationContext
                ("configuration.xml"); 
		
	/** Simple bean blank constructor **/
	Songwriter simpleBeanExample=(Songwriter)context.
              getBean("ourFirstBean"); 
	
	SongWriterImpl songwriter=(SongWriterImpl)context.getBean("mary");
	 System.out.println("The songwriters firstname is: "+ songwriter.getFirstname() + ": The songwriters lastname is: "+ songwriter.getLastname() +
	        " The songwriters age is: " + songwriter.getAge() + " The songwriters song name is: " + songwriter.getSong().getName()+" The songwriters song lyrics are: "+
	        songwriter.getSong().getLyrics());
	 
	 Venue venue=(Venue)context.getBean("stage");
	 System.out.println("The venue is called: "+ venue.getName() + ": Which is located at: "+ venue.getAddressLine1() +
	        " in county: " + venue.getAddressLine2() + " in the country: " + venue.getCountry()+" The capacity: "+
	        venue.getCapacity());
                            
         }
  }
