package ch.zli.m223.punchclock.domain;

import javax.persistence.*;

@Entity
public class Kategorie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String kategorie;

    public Kategorie(long id, String kategorie) {
        this.id = id;
        this.kategorie = kategorie;
    }

    public Kategorie(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

}
