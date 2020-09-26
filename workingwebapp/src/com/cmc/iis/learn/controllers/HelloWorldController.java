package com.cmc.iis.learn.controllers;




import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cmc.iis.learn.form.Contact;
import com.cmc.iis.learn.service.ContactService;


@Controller
public class HelloWorldController {
	
	@Autowired
    private ContactService contactService;
	
	
@RequestMapping({"/","/home"})
public String showHomePage(ModelMap model){
	
	System.out.println("in show homepage");
	Contact con =new Contact();
	con.setEmail("email");
	con.setFirstname("anand");
	con.setLastname("singh");
	con.setTelephone("12124");
	
	Contact con12 =new Contact();
	con12.setEmail("email12");
	con12.setFirstname("anand12");
	con12.setLastname("singh12");
	con12.setTelephone("1212432");
	
	System.out.println("before dao");
	//contactService.addContact(con12);
	System.out.println("before arry");
	
	
	ArrayList<String> al = new ArrayList<String>();
    //add elements to the ArrayList
    al.add("JAVA");
    al.add("C++");
    al.add("PERL");
    al.add("PHP");
	
   
    
model.put("spittles",al);
System.out.println("after model");
return"login";
}


@RequestMapping(value="/param", method=RequestMethod.GET)
public String showParameter(@RequestParam("name") String name, Model model)
{
	String message = "Hi " + name + "!";
    model.addAttribute("message", message);
	return "paramview";
}







}