package br.com.screenmatch.randomphrases.dto;

public record PhraseDTO(
    Long id,
    String titulo,
    String phrase,
    String personagem,
    String poster
) { }
