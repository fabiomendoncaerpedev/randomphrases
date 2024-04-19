package br.com.screenmatch.randomphrases.controller;

import br.com.screenmatch.randomphrases.controller.service.PhraseService;
import br.com.screenmatch.randomphrases.dto.PhraseDTO;
import br.com.screenmatch.randomphrases.model.Phrase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class PhraseController {
    @Autowired
    private PhraseService phraseService;

    @GetMapping("/frases")
    public PhraseDTO getRandomPhrase() {
        return phraseService.getRandomPhrase();
    }

}
