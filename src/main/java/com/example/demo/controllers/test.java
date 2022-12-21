package com.example.demo.controllers;



import java.util.ArrayList;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;










@RestController
@RequestMapping("api/books")


public class test {


    public ArrayList books = new ArrayList<>();
    
	@GetMapping("/getbooks")
	public ArrayList getbooks() {
        return books;
	}

    @PostMapping("/addbook")
	public Object addbook(@RequestBody Object book) {
        books.add(book);
        
        return books;
	}

    
    @DeleteMapping("/deletebook")
	public Object deletebook(@RequestParam String id) {

        return books;
	}

    // @PutMapping("/editbook")
	// public ResponseEntity<String> editbook(@RequestParam String name , String author) {
    //     if (map.containsKey(name)){
    //         map.put(name, author);
    //         String message = "Book Updated Successfully";
    //         return ResponseEntity
    //         .status(200)
    //         .body(message);
       

    //  }

    //  else {
    //     String message = "No Book Found";
    //     return ResponseEntity
    //     .status(200)
    //     .body(message);
   

    //  }

            
    // }
}

