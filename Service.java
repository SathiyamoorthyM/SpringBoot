package com.SpringBoot.PerfectNumber;

// find given number is perfect number or not in spring boot 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                   // annotation for request and response of end point 
public class Service 
{
	@RequestMapping("/test")    
	public String Test()
	{
		return "request Working properly";
	}
	
	@GetMapping("/PerfectNumber/{num}")
	public boolean perfectNumber (@PathVariable ("num") int num)
	{
		boolean flag=false;
		int sum=0;
		
		for(int i=1; i<= (num/2); i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==num)
		{
			flag=true;
		}
		
		return flag;
		
	}
	
}

/*
When the give "URL : http://localhost:8080/PerfectNumber/6"(end point)
--PerfectNumber is method
--6 is input data for the method

o/p: 6--true
  	 5--false

*/