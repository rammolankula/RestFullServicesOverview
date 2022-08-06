//package RestOverview.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import RestOverview.model.Employee;
//
//@RestController
//@RequestMapping("/employee")
//public class SymbolResponse {
//	
//	@GetMapping("/save")
//	public ResponseEntity<?>  saveEmp(){
//		ResponseEntity<?> resp=null;
//		Employee emp=new Employee();
//		if(emp.getEmpId().equals("")) {
//			//Emp object output
//			resp=new ResponseEntity<Employee>(HttpStatus.ok);
//		}else {
//			//String msg object
//			resp=new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
//		}
//		return
//		}
//
//}
