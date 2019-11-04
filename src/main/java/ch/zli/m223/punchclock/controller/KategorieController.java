package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.domain.Kategorie;
import ch.zli.m223.punchclock.service.EntryService;
import ch.zli.m223.punchclock.service.KategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kategorien")
public class KategorieController {

    @Autowired
    private KategorieService kategorieService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Kategorie> getAllKategories() {
        return kategorieService.findAll();

    }
}
