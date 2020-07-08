package application;

import org.junit.Before;
import org.junit.Test;
import application.Cinema;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class testUser {
 User U;
 @Before
 public void naor()
	{
		U= new User();
	}
  
 @Test
 public void testGetOrderListString()
 {
	 U.getOrederList();
 U.getOrederList().add(new Order(3,"harryPoter"));
	 assertEquals("when added new order to list the number order is 1",1,U.getOrederListString().size());
	
 }

 
 
 
 
}
 