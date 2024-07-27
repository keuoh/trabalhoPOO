public class Data{
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;

    public Data(int dia, int mes, int ano, int hora, int minuto){
        this.ano = ano;

        if(mes > 0 && mes < 13){
            this.mes = mes;
        }
        
        if(dia > 0 && dia < 31){
            this.dia = dia;
        }
        
        if(hora >= 0 && hora < 24){
            this.hora = hora;
        }
        
        if(minuto > 0 && minuto < 60){
            this.minuto = minuto;
        }
    }

    public void visualizarHorario(){
        // esse metodo retorna a visualizacao de horario e data relacionado a reserva;     
    }
}