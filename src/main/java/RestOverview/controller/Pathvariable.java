package RestOverview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class Pathvariable {
	/*
	 * if URL will be same as like below it will make ambiguity
	 * find/{id}
	 * find/{code}
	 * if its different it wont make ambiguity
	 * */
	@GetMapping("find/{id}")
	public String empA(@PathVariable Integer id) {
		return "Data is"+id;	
	}
	@GetMapping("find/code")
	public String empB(@PathVariable String code)
	{
		return "Data is none";
	}
}
