package br.com.screenmatch.randomphrases.repository;

import br.com.screenmatch.randomphrases.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {
    @Query("SELECT p FROM Phrase p order by function('RANDOM') LIMIT 1")
    Phrase getRandomPhrase();
}
