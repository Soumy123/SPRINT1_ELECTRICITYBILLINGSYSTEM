package com.capg.ebs.entities;

public class Units {
<<<<<<< HEAD
	 
	
       public static double calculateBillPay(int units) {
       Billing bill=new Billing();
       units= bill.getUnits();
 	   double billpay=0;
 	
       if(units<100)
	 billpay= units*1.20;

	    else if(units<300 &&units>100)
	billpay=100*1.20+(units-100)*2;

    else if(units>300)
	billpay=100*1.20+200 *2+(units-300)*3;
   return billpay;
} 
=======

>>>>>>> refs/heads/master
}
