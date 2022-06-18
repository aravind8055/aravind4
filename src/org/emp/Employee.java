package org.emp;

public class Employee {
       void empId() {
		System.out.println("default");
	    }
      protected void empCard() { 
		System.out.println("1474");

	}
      public static void empyou() {
    	  System.out.println("abcd");
      }
      
      private void empIam() {
    	  System.out.println("efgh");
      }
      
      public static void main(String[] args) {
		Employee c = new Employee ();
		
		c.empId();
		c.empCard();
		c.empyou();
		c.empIam();
		
	}
   
		

}
