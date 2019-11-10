package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.User;
import ch.zli.m223.punchclock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<User> findAll() {
        return userRepository.findAll();
    }
}
