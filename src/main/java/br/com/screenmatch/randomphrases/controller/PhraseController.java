package br.com.screenmatch.randomphrases.controller;

import br.com.screenmatch.randomphrases.dto.PhraseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class PhraseController {

    @GetMapping("/frases")
    public String getRandomPhrase() {
        return "working...";
    }

}
