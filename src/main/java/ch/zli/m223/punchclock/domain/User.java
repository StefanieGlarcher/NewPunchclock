package ch.zli.m223.punchclock.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String passwort;

    @ManyToOne
    @JoinColumn(name = "entry", nullable = false)
    private Entry entry;


    public User(long id, String name, String passwort, Entry entry) {
        this.id = id;
        this.name = name;
        this.passwort = passwort;
        this.entry = entry;
    }

    public User(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
}
