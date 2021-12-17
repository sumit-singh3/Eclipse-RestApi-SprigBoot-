package com.qnchat.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qnchat.test.model.Operation;
import com.qnchat.test.model.OperationRepository;

@RestController
@RequestMapping("/operation")

public class MyController{
	
 @Autowired
   OperationRepository operationRepository;
 
     @PostMapping("/find")
     public Operation addOperationData(@RequestBody Operation operation) {
    	 Operation operation1 = operationRepository.save(operation);
    	 return operation1;
    	 
     }
     @GetMapping("/find")  
     public List<Operation> findAllOperation() {
    	 try {
    	 List<Operation> allOperation = operationRepository.findAll();
    	 return allOperation;
    	 }catch(Exception e) {
    		 System.out.pritln(e.getMessage());
    	 }
     }
     @GetMapping("/find/{id}")
     public Operation findOperationId(@PathVariable (value = "id") Integer id) {
    	 Operation operation = operationRepository.findById(id).get();
    	 return operation;
    	 }
    	 
    	 
     }
     
      @DeleteMapping("/find/{id}")
      public String deleteOperaionId(@PathVariable (value = "id")Integer id) {
    	  Operation operation = operationRepository.findById(id).get();
    	  operationRepository.delete(operation);
    	  return "succesFully";
      }
     @PutMapping("/find/{id}")
     public String update(@PathVariable (value="id")Integer id, @RequestBody Operation operation1) {
    	   
   	  Operation operation = operationRepository.findById(id).get();
      operation.setName(operation1.getName());
     operation.setTitle(operation1.getTitle());
     operation.setHobby(operation1.getHobby());
	  operationRepository.save(operation);
     return "success..";
     
     }
    
	
	
}
