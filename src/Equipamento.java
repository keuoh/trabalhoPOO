import java.util.ArrayList;
import java.util.List;

public class Equipamento {
    private String nome;
    private String unidade;
    private int identificador;
    private String disponibilidade;
    private List<String> avaliacao;

    public Equipamento(String nome, String unidade, int identificador, String disponibilidade) {
        this.nome = nome;
        this.unidade = unidade;
        this.identificador = identificador;
        this.disponibilidade = disponibilidade;
        this.avaliacao = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public List<String> getAvaliacao() {
        return avaliacao;
    }

    public void adicionarAvaliacao(String avaliacao) {
        this.avaliacao.add(avaliacao);
    }

    public void visualizarDisponibilidade() {
        System.out.println("Disponibilidade do equipamento: " + disponibilidade);
    }

    public void realizarAvaliacao(String avaliacao) {
        adicionarAvaliacao(avaliacao);
        System.out.println("Avaliação adicionada: " + avaliacao);
    
    }

}
