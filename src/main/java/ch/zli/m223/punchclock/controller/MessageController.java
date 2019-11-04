package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Message;
import ch.zli.m223.punchclock.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Message> getAllUsers() {
        return messageService.findAll();

    }
}
