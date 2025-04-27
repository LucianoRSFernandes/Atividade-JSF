package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private List<String> nomesCadastrados;

    public Pessoa() {
        this.nomesCadastrados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomesCadastrados() {
        return nomesCadastrados;
    }

    public void setNomesCadastrados(List<String> nomesCadastrados) {
        this.nomesCadastrados = nomesCadastrados;
    }

    public String adicionarUsuario() {
        if (this.nome != null && !this.nome.trim().isEmpty()) {
            this.nomesCadastrados.add(this.nome);
            this.nome = null; // Limpa o campo após adicionar
            return null; // Permanece na mesma página
        }
        return null; // Permanece na mesma página se o nome estiver vazio
    }
}