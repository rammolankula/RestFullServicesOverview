package RestOverview.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestOverview.model.Employee;

@RestController
@RequestMapping("/Testjsonxml")
public class TestJXcontroller {
	/* I worked on this controller to SEND--->json/xml request andto get response as well
	 *   -----i) if i send the Request as JSON format to controller will give the response as JSON format
	 *   -----ii)if i send the Request as XML format to controller will give the response as XML format
	 * */
	
	@PostMapping("/save")
	public ResponseEntity<String> savedata(@RequestBody Employee employee){
		return new ResponseEntity<String>("Data is"+employee.toString(),HttpStatus.CREATED);
	}

}
