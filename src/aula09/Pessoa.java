package aula09;

import javax.swing.JOptionPane;

public class Pessoa implements Interface{
    
    private String nome;
    private int idade;
    private String sexo;
    
    
    
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public Pessoa() {
    }

    
    
    
    
    
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public void fazerAniver() {
        this.setIdade(this.getIdade()+1);
    }

    @Override
    public void status() {
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\n" +
                                            "Idade: " + this.getIdade() + "\n" +                                    
                                             "Sexo: " + this.getSexo());
    }
    
    
}
