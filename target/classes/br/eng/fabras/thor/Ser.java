import java.util.ArrayList;

public abstract class Ser {
    private String nome;
    private String moradia;
    private boolean vivo;
    private List<Ser> filhos = new ArrayList<Ser>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMoradia() {
        return moradia;
    }
    public void setMoradia(String moradia) {
        this.moradia = moradia;
    }
    public boolean isVivo() {
        return vivo;
    }
    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    public List<Ser> getFilhos() {
        return filhos;
    }
    public void setFilhos(List<Ser> filhos) {
        this.filhos = filhos;
    }
}
