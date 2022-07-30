package RestOverview.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestOverview.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	/*
	 * REST: REPRESENTATIONAL STATE TRANSFeR
	 * Below i wrote two type of methods returning with responseEntity and method returning without ResposneEntity
	 * ResponseEntity ReturnS the Msg or Response along with the STATUS with the help og HTTPSTATUS and it is serilaized into ResponseBody
	 * ResponseBody is Nothing but returning the Response without status of the Response and it is serilaized into ResponseBody of HTTP Response
	 * Here worked
	 * Printing MESSAGE By using ResponseEntity & ResponseBody
	 * Printing OBJECT By using ResponseEntity & ResponseBody
	 * Printing LIST OF OBJECTS By using ResponseEntity & ResponseBody
	 * */
	@GetMapping("/msgA")
	public String showmsg() {
		return "Wellcome to LearningWorld";
	}
	@GetMapping("/msgB")
	public ResponseEntity<String> msgb(){
		return new ResponseEntity<String>("Wellcome to LearningWorld",HttpStatus.BAD_REQUEST);
	}
	@GetMapping("/objA")
	public Employee objA() {
		return new Employee(10,"Ram",25.0);
	}
	@GetMapping("/objB")
	public ResponseEntity<Employee> ShowListA(){
		return new ResponseEntity<Employee>(new Employee(10,"Ram", 25.0),HttpStatus.OK);
	}
	@GetMapping("/listA")
	public List<Employee> showobjA(){
		List<Employee> users=new ArrayList<Employee>();
		users.add(new Employee(1,"Ram",23.0));
		users.add(new Employee(2, "Shyam", 24.0));
		users.add(new Employee(3, "Manoj", 25.0));
		return users;
	}
	@GetMapping("/listB")
	public ResponseEntity<List<Employee>> ShowListB(){
		List<Employee> users=new ArrayList<Employee>();
		users.add(new Employee(1,"Ram",23.0));
		users.add(new Employee(2, "Shyam", 24.0));
		users.add(new Employee(3, "Manoj", 25.0));
		return new ResponseEntity<List<Employee>>(users,HttpStatus.CREATED);
	}	
}
