package com.library.of.books.library.web.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class SimpleTextController {

    @GetMapping("/print/{text}")
    public String getAllBooks(@PathVariable String text) {
        return text;
    }

}
