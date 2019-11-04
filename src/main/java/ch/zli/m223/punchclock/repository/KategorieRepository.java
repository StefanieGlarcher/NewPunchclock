package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.domain.Kategorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KategorieRepository  extends JpaRepository<Kategorie, Long> {
}
