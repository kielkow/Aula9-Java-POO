package aula09;

import javax.swing.JOptionPane;

public class Aula09 {

    public static void main(String[] args) {
        
        Pessoa pessoa[] = new Pessoa[5];
        Livro livro[] = new Livro[5];
        
        int i = 0;
        String s = "sim";
        while(i <= pessoa.length && s.equals("sim") ){
            
                pessoa[i] = new Pessoa();
                livro[i] = new Livro();
                
                pessoa[i].setNome(JOptionPane.showInputDialog("Digite seu nome: "));
                pessoa[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
                pessoa[i].setSexo(JOptionPane.showInputDialog("Digite seu sexo: "));
                
                pessoa[i].status();
                pessoa[i].fazerAniver();
                pessoa[i].status();
                
                livro[i].setTitulo(JOptionPane.showInputDialog("Digite o titulo: "));
                livro[i].setAutor(JOptionPane.showInputDialog("Digite o autor: "));
                livro[i].setTotPaginas(Integer.parseInt(JOptionPane.showInputDialog("Digite o total de paginas: ")));
                
                livro[i].detalhes(pessoa[i].getNome());
                
                livro[i].folhear(200);
                livro[i].abrir();
                livro[i].avancarPag();
                livro[i].voltarPag();
                
                livro[i].detalhes(pessoa[i].getNome());
                
                i++;
                s = JOptionPane.showInputDialog("Deseja continuar preenchendo?");
        }
        
        
        
        
        
        
    }
    
}
