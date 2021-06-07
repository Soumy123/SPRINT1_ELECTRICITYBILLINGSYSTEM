package com.capg.ebs.util;

import java.util.ArrayList;
import java.util.List;

import com.capg.ebs.dto.CustomerDto;
import com.capg.ebs.entities.Customer;

public class CustomerUtils {
	public static List<Customer> convertToCustomerDTOList(List<CustomerDto> list){
		List<Customer> dtolist = new ArrayList<Customer>();
		list.stream().forEach( t ->{
			Customer customer = new Customer();
			customer.setCustomerId(t.getCustomerId());
			customer.setCustomerName(t.getCustomerName());
			customer.setMobileNumber(t.getMobileNumber());
			customer.setAddress(t.getAddress());
			dtolist.add(customer);
		});
		return dtolist;
	}
	
	public static Customer convertToCustomerDto(CustomerDto CustomerDto) {
		Customer customer = new Customer();
		
		customer.setCustomerId(CustomerDto.getCustomerId());
		customer.setCustomerName(CustomerDto.getCustomerName());
		customer.setMobileNumber(CustomerDto.getMobileNumber());
		customer.setAddress(CustomerDto.getAddress());
		return customer;
	}
	
	
		
		public static Customer convertToCustomer(CustomerDto customerdto) {
			Customer customer = new Customer();
			customer.setCustomerId(customerdto.getCustomerId());
			customer.setCustomerName(customerdto.getCustomerName());
			customer.setMobileNumber(customerdto.getMobileNumber());
			customer.setAddress(customerdto.getAddress());
			return customer;
		}
		
	


}
