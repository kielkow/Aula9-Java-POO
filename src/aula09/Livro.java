package aula09;

import javax.swing.JOptionPane;

public class Livro implements Publicacao{
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    
    
    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.setPagAtual(0);
        this.setAberto(false);
        this.leitor = leitor;
    }
    public Livro() {
    }

    
    
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
    
    
    
    
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotPaginas()){
            this.setPagAtual(0);
        }
        else{
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }

    @Override
    public void detalhes(String leitor) {
         JOptionPane.showMessageDialog(null,"Titulo: " + this.getTitulo() + "\n" +
                                             "Autor: " + this.getAutor() + "\n" +                                    
                                             "Total de Paginas: " + this.getTotPaginas() + "\n" + 
                                             "Pagina Atual: " + this.getPagAtual() + "\n" +
                                             "Aberto: " + this.getAberto() + "\n" + 
                                             "Leitor: " + leitor
         );
    }

    @Override
    public String detalhes2(String leitor) {
        return "Livro{" + "titulo=" + titulo + ", autor=" 
               + autor + ", totPaginas=" + totPaginas + ", "
               + "pagAtual=" + pagAtual + ", aberto=" + aberto + 
               ", leitor=" + leitor + '}';
    }
    
}
