package pl.mazur.pawel.documentsmasterbe.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "DOCUMENT")
public class Document {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private long id;

    @Column(name = "VALUE")
    private String value;

}
