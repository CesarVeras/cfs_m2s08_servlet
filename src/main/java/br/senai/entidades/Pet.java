package br.senai.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Pet {
    private Long id;
    private String nome;
    private String especie;
    private String raca;
    private String cor;
    private float peso;
    private LocalDate dataNascimento;
    private int idade;

    public Pet() {}

    public Pet(Long id, String nome, String especie, String raca, String cor, float peso, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.setIdade();
    }

    public Pet(String nome, String especie, String raca, String cor, float peso, LocalDate dataNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.peso = peso;
        this.dataNascimento = dataNascimento;
        this.setIdade();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        setIdade();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade() {
        this.idade = LocalDate.now().getYear() - dataNascimento.getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return idade == pet.idade && Objects.equals(id, pet.id) && Objects.equals(nome, pet.nome) && Objects.equals(especie, pet.especie) && Objects.equals(raca, pet.raca) && Objects.equals(cor, pet.cor) && Objects.equals(dataNascimento, pet.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, especie, raca, cor, dataNascimento, idade);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", idade=" + idade +
                '}';
    }
}
