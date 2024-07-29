class Administrador{

    private Reserva listaDeReserva[];

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String vinculo;
    private String telefone;

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public String getVinculo(){
        return vinculo;
    }
    public String getTelefone(){
        return telefone;
    }

    public void cadastrarEquipamento(Equipamento equipamento){
        //cadastra um equipamento
    }

    public void excluirEquipamento(Equipamento equipamento){
        // verifica se o equipamento ja e cadastrado
        //exclui equipamento 
        
    }

    public void cadastrarEspaco(Espaco espaco){
        //casdastra um espaco que pode ser reservado
    }

    public void excluirEspaco(Espaco espaco){
        //verifica se o espaco ja eh cadastrado
        //exclui um espaco
    }

    public void atribuirStatus(){
        //atribui a reserva os status do processo de reserva 
    }

    public void atribuirDisponibilidade(){
        //atribui aos equipamentos ou espacos o status de disponivel ou nao disponivel 
    }

    public void adicionarReserva(){
        //adiciona ao sistema a reserva
    }
    
    public void definirPrioridade(){
        //analisa as caracteristicas da reserva e define prioridade
    }

    public Reserva atribuirManutencao(){
        //verifica se o espaco ou o equipamento precisa de manutencao
        //se for necessario fazer manutencao retorna Reserva
        //e reserva o espaco ou equipamento para manutencao
    }

}
