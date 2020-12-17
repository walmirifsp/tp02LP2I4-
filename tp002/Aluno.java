/*
 * Aluno 1: Vinicius do Carmo Costa
 * Aluno 2: Aramis Nogueira
 */

import java.util.UUID;

public class Aluno {
  private UUID uuid;
  private int idade;
  private String nome;
  private String endereco;

  public Aluno(String name,String address, int age) {
    this.nome = name;
    this.endereco = address;
    this.idade = age;
    this.uuid = UUID.randomUUID();
  }

  public void setUUID(UUID uuid) {
    this.uuid = uuid;
  }

  public UUID getUUID() {
    return this.uuid;
  }

  public void setIdade( int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getEndereco() {
    return this.endereco;
  }
}
