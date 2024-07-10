package com.example.gittestproject.service;

import com.example.gittestproject.repository.TextHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;

@Service
public class PrintText {

    private final TextHistoryRepository textHistoryRepository;

    @Autowired
    public PrintText(TextHistoryRepository textHistoryRepository) {
        this.textHistoryRepository = textHistoryRepository;
    }

    private void printText(String text) {
        System.out.println(text);
        textHistoryRepository.logsText(text);

    }
}
