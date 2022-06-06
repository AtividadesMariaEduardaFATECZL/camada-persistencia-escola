package com.example.crudescolahibernate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    private List<Disciplina> disciplinas = new ArrayList<>();
    @ManyToMany
    private List<Aluno> alunos = new ArrayList<>();
}
