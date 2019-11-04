package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Message;
import ch.zli.m223.punchclock.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;


    public List<Message> findAll() {
        return messageRepository.findAll();
    }
}
