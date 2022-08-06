package RestOverview.controller;

import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/httpcheck")
public class HTTPStatus {
	/*
	 * use ResponseEntity  to pass the HTTP status value this is one ENUM (Set of possible values) programmes works 
	 * ResponseEntity works on 3 types of Statuses
	 * A)Client side errors(4xx)
	 * B)Server side errors(5xx)
	 * C)Success Message(2XX)
	 * */
	
	@GetMapping("/status")
	public ResponseEntity<String> data(){
		Integer id=new Random().nextInt();
		ResponseEntity<String> resp=null;
		try {
			if(id<=0) {
				resp=new ResponseEntity<String>("invalid is provided",HttpStatus.BAD_REQUEST);
			}else {
				resp=new ResponseEntity<String>("Employee data found::::::"+id,HttpStatus.OK);
			}
		}catch (Exception e) {
			e.printStackTrace();
			resp=new ResponseEntity<String>("problem found"+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}

}
