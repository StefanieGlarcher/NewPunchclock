package ch.zli.m223.punchclock.config;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.domain.Message;
import ch.zli.m223.punchclock.domain.User;
import ch.zli.m223.punchclock.repository.EntryRepository;
import ch.zli.m223.punchclock.repository.MessageRepository;
import ch.zli.m223.punchclock.repository.RoleRepository;
import ch.zli.m223.punchclock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;

@Component
public class Initialize {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;

    @PostConstruct
    public void initialize(){

        LocalDateTime localDateTime = LocalDateTime.now();
        Entry entry = new Entry(0, localDateTime, localDateTime);
        entryRepository.save(entry);

        Message message = new Message(0, "Dies ist eine Message");
        message = messageRepository.save(message);

        Entry entry2 = new Entry(0, localDateTime, localDateTime, message);
        entry2 = entryRepository.save(entry2);

        User user = new User(0, "Steffi", "Steffi", false, entry2);
        user = userRepository.save(user);

    }

}
