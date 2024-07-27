public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("aula lab", 7799888,"", "aluno@ufc.br", "ola78", "prof", "11998748552");
        System.out.println(prof.getNome() + "," + prof.getEmail()+ "," + prof.getTelefone() + "," + prof.getId());

        Data data = new Data(01,10,2003,15,30);
        data.visualizarHorario();
    }
}