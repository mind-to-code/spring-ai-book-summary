package com.mindtocode.springaibooksummary.service;

import com.mindtocode.springaibooksummary.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.client.AiClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookSummaryService {

    public static final String SUMMARY_PROMPT = "Summarize the book titled '%s' in an 80/20 manner.";

    private final AiClient aiClient;

    public Book getBookSummary(String title) {
        String summary = aiClient.generate(String.format(SUMMARY_PROMPT, title));

        Book book = new Book();
        book.setTitle(title);
        book.setSummary(summary);

        return book;
    }
}