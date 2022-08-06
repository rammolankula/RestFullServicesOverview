package RestOverview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pathrun {
      	/*
	     *thiS WILL Take the Id as well as String data 
	     * */
	    @GetMapping("/find/{id}/{code}")
	    public String EmpC(@PathVariable Integer id,@PathVariable String code) {
		return "Data is::::::"+id+"-"+code;
	}

}
