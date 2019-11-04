package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Kategorie;
import ch.zli.m223.punchclock.repository.KategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KategorieService {
    @Autowired
    private KategorieRepository kategorieRepository;


    public List<Kategorie> findAll() {
        return kategorieRepository.findAll();
    }
}
