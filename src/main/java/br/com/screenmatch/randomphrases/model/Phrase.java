package br.com.screenmatch.randomphrases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "phrases")
public class Phrase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String title;
    private String phrase;
    private String character;
    private String poster;

    public String getTitle() {
        return title;
    }

    public String getPhrase() {
        return phrase;
    }

    public String getCharacter() {
        return character;
    }

    public String getPoster() {
        return poster;
    }
}
