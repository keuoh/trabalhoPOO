import java.util.ArrayList;
import java.util.List;

public class Espaco {
    private String nome;
    private String unidade;
    private String disponibilidade;
    private String identificador;
    private List<String> avaliacao;

    public Espaco(String nome, String unidade, String disponibilidade, String identificador) {
        this.nome = nome;
        this.unidade = unidade;
        this.disponibilidade = disponibilidade;
        this.identificador = identificador;
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

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public List<String> getAvaliacao() {
        return avaliacao;
    }

    public void adicionarAvaliacao(String avaliacao) {
        this.avaliacao.add(avaliacao);
    }

    public void visualizarDisponibilidade() {
        System.out.println("Disponibilidade do espaço: " + disponibilidade);
    }

    public void realizarAvaliacao(String avaliacao) {
        adicionarAvaliacao(avaliacao);
        System.out.println("Avaliação adicionada: " + avaliacao);
    }
   
}
