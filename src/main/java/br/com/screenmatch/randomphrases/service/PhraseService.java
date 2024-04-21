package br.com.screenmatch.randomphrases.service;

import br.com.screenmatch.randomphrases.dto.PhraseDTO;
import br.com.screenmatch.randomphrases.model.Phrase;
import br.com.screenmatch.randomphrases.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {
    @Autowired
    private PhraseRepository phraseRepository;

    public PhraseDTO getRandomPhrase() {
        Phrase randomPhrase = phraseRepository.getRandomPhrase();

        return new PhraseDTO(
                randomPhrase.getTitle(),
                randomPhrase.getPhrase(),
                randomPhrase.getCharacter(),
                randomPhrase.getPoster()
        );
    }
}
