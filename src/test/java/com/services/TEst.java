package com.services;



import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.joda.time.DateTime;
import org.joda.time.DateTimeUtils;
import org.joda.time.Days;
import org.springframework.util.StringUtils;

import com.zag.services.portal.incentive.CouponResponseWrapper;

public class TEst {
	
	   private static final String MERCEDES_BENZ_MAX_CONTROL_NUMBERS_ERROR_MESSAGE = "max controlnumbers  generated for this customer";

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	String errorMessage = "Max ControlNumbers  generated for this customer.. Last control Num generated - 484FB2";
	
	if(errorMessage.toLowerCase().contains(TEst.MERCEDES_BENZ_MAX_CONTROL_NUMBERS_ERROR_MESSAGE)){
		System.out.println("Error Message Contains : " + MERCEDES_BENZ_MAX_CONTROL_NUMBERS_ERROR_MESSAGE);
	}
	
	
		//org.apache.cxf.common.util.StringUtils.split("");
		/*CouponResponseWrapper wrapper = new CouponResponseWrapper("HERERERJ81948"); 
		ObjectMapper mapper = new ObjectMapper();
		//org.codehaus.jackson.JsonGenerationException e = null;
		String jsonInString = mapper.writeValueAsString(wrapper);
		System.out.println(jsonInString);
		User user = new User("Akshara", 5, "Los Angeles", null);
		String userMessage = mapper.writeValueAsString(user);
		System.out.println(userMessage);
		 DateTime today = new DateTime(new Date());
		 DateTime modifiedDate = new DateTime(new Date()).plusDays(29);
		 System.out.println("Today :" + today);
		 System.out.println("Modified Date :" + modifiedDate);
		 Days days = Days.daysBetween(today, modifiedDate);
		 System.out.println(days.getDays() + " : " + 30);
          if (days.getDays() < 30) {
        	  System.out.println("Use Existing Coupon");
          } else {
        	  System.out.println("Create New Coupon");
          }*/
	     
	/*	int one[][] = { {1, 2} , { 4, 5} };
		int two[][] = { {6, 11} , { 8, 7} };
		for(int i = 0; i < one[0].length; i ++) {
			System.out.println("");
			for(int j = 0; j < two[0].length; j++) {
				System.out.print(one[i][j] * two[i][j]);
				System.out.print(" ");
			}
		}*/


	}

}
