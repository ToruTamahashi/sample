package com.example.demo.service;

import com.example.demo.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl extends MessageService {
    private List<Message> messages;

    public MessageServiceImpl() {
        messages = new ArrayList<Message>();
    }

    @Override
    public void addMessage(String message) {
        Message messageObj = new Message();
        messageObj.setMessage(message);
        messages.add(messageObj);
    }

    @Override
    public List<Message> getMessages() {
        return messages;
    }
}
