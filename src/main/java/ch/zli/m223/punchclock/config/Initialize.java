package ch.zli.m223.punchclock.config;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.domain.Message;
import ch.zli.m223.punchclock.domain.Role;
import ch.zli.m223.punchclock.domain.User;
import ch.zli.m223.punchclock.repository.EntryRepository;
import ch.zli.m223.punchclock.repository.MessageRepository;
import ch.zli.m223.punchclock.repository.RoleRepository;
import ch.zli.m223.punchclock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Collections;


// create record in h2 database by starting the application
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

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostConstruct
    public void initialize(){

        // Einträge die die beim Builden erstellt werden.
        LocalDateTime localDateTime = LocalDateTime.now();
        Entry entry = new Entry(1, localDateTime, localDateTime);
        entryRepository.save(entry);

        Message message = new Message(0, "Dies ist eine Message", localDateTime);
        message = messageRepository.save(message);

        Role role = new Role(0, "Hier kommt die Userrolle", localDateTime);
        role = roleRepository.save(role);

        Role role2 = new Role(2, "Administrator", localDateTime);
        role2 = roleRepository.save(role2);

        User user = new User(1, "user", bCryptPasswordEncoder.encode("user"), false, entry, message, role);
        user = userRepository.save(user);

        User user2 = new User(2, "admin", bCryptPasswordEncoder.encode("admin"), true, entry, message, role2);
        user2 = userRepository.save(user2);

    }
}
