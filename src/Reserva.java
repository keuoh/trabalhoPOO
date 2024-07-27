public class Reserva{
    private Data data;
    private String status;
    private String finalidade;

    public Data getData(){
        return data;
    }
    public String getStatus(){
        return status;
    }
    public String getFinalidade(){
        return finalidade;
    }

    public void visualizarReserva(){
        //Retorna a data da reserva, o status(disponivel ou nao) e a finalidade da reserva
    }
    public void excluirReserva(){
        //Exclui a reserva
        //Retorna confirmacao de exclusao
    }
    public void editarReserva(){
        //Edita a reserva
        //Retorna os dados atualizados
    }
}