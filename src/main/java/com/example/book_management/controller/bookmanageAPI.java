package com.example.book_management.controller;

import com.example.book_management.model.bookmanagement;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookmanagement")
public class bookmanageAPI
{
    bookmanagement bookman;
   @GetMapping("{bookID}")


    public bookmanagement getBookManagementdetails(String bookID)
    {
        //return new bookmanagement("001","Name01","Author01",
               // "10");
        return bookman;

    }

    @PostMapping
    //createmethod
    public String createBookManagementDetails(@RequestBody bookmanagement bookman)
    {
        this.bookman=bookman;
        return "New Book Created Successfully!!";
    }

    @PutMapping
    //Updatemethod
    public String updateBookManagementDetails(@RequestBody bookmanagement bookman)
    {
        this.bookman=bookman;
        return "Book Updated Successfully!!";
    }

   @DeleteMapping("{bookID}")
   //Deletemethod
    public String deleteBookManagementDetails(String bookID)
    {
        this.bookman=null;
        return "Book Deleted Successfully!!!";
    }


}
