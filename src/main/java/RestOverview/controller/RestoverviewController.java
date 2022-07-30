package RestOverview.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class RestoverviewController {
	/*Here i define one public class by using spring container to access with annotation @RestController
	 * 
	 * @RestController is a Combination of Controller and ResponseBody
	 * 
	 * ResponseEntity<T> it supports to sending the data http headers and it gives the status information
	 * ResponseEntity<T> should have some basic information like ResponseBody and ResponseStatus
	 * 
	 * Request:  Input type of Request data XML/JSON coverted into OBJECT format and given method is param in our controller	 
	 * 
	 * Response: Restcontroller method returns an object this one object converted to xml/json format and it gives as a output to client machine
	 *  
	 * RESTCONTROLLER:::-RestController is only supports for non-string example:Student,Employee,List<String>,List<Admin> such a data convert into XML/JSON
	 * 
	 * Here iam using methods like ,POST,GET,DELETE,PUT mapping methods to do the operations
	 * 
	 * 
	 * RESPONSEBODY::-ResponseBody no need to applied in code by programmer, this is internally applied when we write @RestController This annonation workd
	 *                only works for Non-String types ie::Employee,Student such data convert into XML/JSON
	 * POST,PUT,GET,DELETE,,,etc Different methods used by using ResponseEntity */
	@PostMapping("/save")
	public ResponseEntity<String> savedata() {
		return new ResponseEntity<String>("savedata",HttpStatus.OK);
	}
	@GetMapping("/fetch")
	public ResponseEntity<String> fetchdata(){
		return new ResponseEntity<String>("fetch the data",HttpStatus.OK);
    }
	@DeleteMapping("/delete")
	public ResponseEntity<String> delete(){
		return new ResponseEntity<String>("delete the data",HttpStatus.OK);
	}
	@PutMapping("/modify")
	public ResponseEntity<String> update(){
		return new ResponseEntity<String>("Modify the data",HttpStatus.OK);
	}
}