package com.example.gittestproject.repository;

import org.springframework.stereotype.Service;

@Service
public class TextHistoryRepository {

    public void logsText(String text) {
        System.out.printf("text : %s сохранен в историю сообщений.\"", text);
    }
}