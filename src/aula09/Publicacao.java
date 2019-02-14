package aula09;

public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int p);
    public abstract void avancarPag();
    public abstract void voltarPag();
    public abstract void detalhes(String leitor);
    public abstract String detalhes2(String leitor);
}
