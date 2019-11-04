package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/entries")
public class EntryController {

    @Autowired
    private EntryService entryService;
    @Autowired
    private EntryValidator entryValidator;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Entry> getAllEntries() {
        return entryService.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Entry createEntry(@Valid @RequestBody Entry entry) {
        return entryService.createEntry(entry);
    }


    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEntry(@PathVariable Long id) {
        entryService.deleteEntry(id);
    }

    @InitBinder("entry")
    public void initEntryBinder(WebDataBinder binder) {
        binder.setValidator(entryValidator);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public  void putEntry(@PathVariable Long id, @Valid @RequestBody Entry entry) {
        entry.setId(id);
        entryService.putEntry(entry);
    }

}
