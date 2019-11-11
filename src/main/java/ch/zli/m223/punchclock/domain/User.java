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
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean inAdmin;

    @ManyToOne
    @JoinColumn(name = "entries", nullable = true)
    private Entry entries;

    @ManyToOne
    @JoinColumn(name = "message", nullable = true)
    private Message message;

    @ManyToOne
    @JoinColumn(name = "roles", nullable = true)
    private Role roles;


    public User(long id, String username, String password, Boolean isAdmin, Entry entries, Message message, Role roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.inAdmin = isAdmin;
        this.entries = entries;
        this.message = message;
        this.roles = roles;
    }

    public User(long id, String username, String password, Boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.inAdmin = isAdmin;
    }

    public User(){}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getInAdmin() {
        return inAdmin;
    }

    public void setInAdmin(Boolean inAdmin) {
        this.inAdmin = inAdmin;
    }

    public Entry getEntries() {
        return entries;
    }

    public void setEntries(Entry entries) {
        this.entries = entries;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }
}
