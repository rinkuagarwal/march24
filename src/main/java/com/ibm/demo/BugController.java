package com.ibm.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BugController {
	 @PostMapping("/bug")
     String createOrder() {
          return "success";
}
     @GetMapping("/bug")
     String getOrder() {
     	return "bug created";
     }
  @PutMapping("/bug/{id}")
  String updateOrder(@PathVariable("id") int bugId){
 	 System.out.println(bugId);
 	 return "bug updated";
  }
  @DeleteMapping("/bug/{id}")
  String deleteOrder(@PathVariable("id") int bugId) {
 	 System.out.println(bugId);
 	 return "bug delete";
  }
}
