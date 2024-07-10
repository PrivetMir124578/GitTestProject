package com.example.gittestproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrintText {

    private String text;

    @Autowired
    public PrintText(String text) {
        this.text = text;
    }

    private void printText() {
        System.out.println(text);
    }
}
