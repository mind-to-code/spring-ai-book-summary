package com.mindtocode.springaibooksummary.controller;

import com.mindtocode.springaibooksummary.entity.Book;
import com.mindtocode.springaibooksummary.service.BookSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookSummaryController {

    @Autowired
    private BookSummaryService bookSummaryService;

    @GetMapping("/summary")
    public Book getSummary(@RequestParam String title) {
        return bookSummaryService.getBookSummary(title);
    }

}
