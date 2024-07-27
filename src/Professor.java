import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Professor {
    private String descricao;
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String vinculo;
    private String telefone;

    private static final Pattern emailPattern = Pattern.compile("^[0,9a-z]{1,}[@][a-z]{1,}[.][a-z]{2,3}$");
    private static final Pattern telefonePattern = Pattern.compile("^[1-9][1-9]9[0-9]{4}[-]?[1-9]{4}$");

//    construtor
    public Professor(String descricao, int id, String nome, String email, String senha, String vinculo, String telefone){
        setDescricao(descricao);
        setId(id);
        setEmail(email);
        setNome(nome);
        setTelefone(telefone);
        setVinculo(vinculo);
    }

    //getters e setters

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao) {
        if (descricao != null) {
            this.descricao = descricao;
        }
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        if (String.valueOf(id).length() == 7) {
            this.id = id;
        }
    }


    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        Matcher matcher = emailPattern.matcher(email);
        if (matcher.matches()) {
            this.email = email;
        }

    }


    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha) {
        if (senha != null && senha.length() > 6) {
            this.senha = senha;
        }
    }

    public String getVinculo(){
        return vinculo;
    }
    public void setVinculo(String vinculo) {
        if (vinculo != null) {
            if (vinculo == "administrador" || vinculo == "aluno" || vinculo == "professor") {
                this.vinculo = vinculo;
            }
        }
    }

    public String getTelefone () {
        return telefone;
    }
    
    public void setTelefone (String telefone){
        Matcher matcher = telefonePattern.matcher(telefone);
        if (matcher.matches()) {
            this.telefone = telefone;
        }
    }

}

//metodos
//public void excluirProfesor()
//public void editarProfesor()
//public Reserva realizarReserva(Equipamento equipamento)
//public Reserva realizarReserva(Espaco espaco)
