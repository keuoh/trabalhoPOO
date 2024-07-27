public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("aula lab", 7799888,"", "aluno@ufc.br", "ola789", "prof", "11998748552");
        System.out.println(prof.getNome() + "," + prof.getEmail()+ "," + prof.getTelefone() + "," + prof.getId());
    }
}