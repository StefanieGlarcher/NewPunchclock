package ch.zli.m223.punchclock.config;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.domain.Kategorie;
import ch.zli.m223.punchclock.domain.Message;
import ch.zli.m223.punchclock.domain.User;
import ch.zli.m223.punchclock.repository.EntryRepository;
import ch.zli.m223.punchclock.repository.KategorieRepository;
import ch.zli.m223.punchclock.repository.MessageRepository;
import ch.zli.m223.punchclock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
public class Initialize {

    @Autowired
    private EntryRepository entryRepository;

    @Autowired
    private KategorieRepository kategorieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;

    @PostConstruct
    public void initialize(){
        Kategorie kategorie = new Kategorie(1, "Test");
        kategorie = kategorieRepository.save(kategorie);

        User user = new User(1, "Steffi", "Steffi");
        user = userRepository.save(user);

        Message message = new Message(1, "Dies ist eine Message");
        message = messageRepository.save(message);

        LocalDateTime localDateTime = LocalDateTime.now();
        Entry entry = new Entry(1, localDateTime, localDateTime);
        entryRepository.save(entry);

        Entry entry2 = new Entry(2, localDateTime, localDateTime, kategorie);
        entryRepository.save(entry2);

    }

}
