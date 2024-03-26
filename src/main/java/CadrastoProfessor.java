
//teste
public class CadastroProfessor {
    public static void main(String[] args){
        Professor prof1 = new Professor();
        prof1.setNome("");
        prof1.setSalario(0);
        prof1.setDisciplina("");
        System.out.println("Prof1 com contrutor vazio e setters");

        Professor prof2 = new Professor("Norberto", 6000, "DS");
        Professor prof3 = new Professor("Gabriel", 5500, "Back-End");
        Professor prof4 = new Professor("Jean", 5800, "Design Grafico");
        Professor prof5 = new Professor("Diego", 5600, "Jogos Diditais");

        System.out.println("Nome: " + prof1.getNome());
        System.out.println("Salario: " + prof1.getSalario());
        System.out.println("Disciplina " + prof1.getDisciplina());
        System.out.println();

        System.out.println("Nome: " + prof2.getNome());
        System.out.println("Salario: " + prof2.getSalario());
        System.out.println("Disciplina: " + prof2.getDisciplina());
        System.out.println();

        System.out.println("Nome: " + prof3.getNome());
        System.out.println("Salario: " + prof3.getSalario());
        System.out.println("Disciplina: " + prof3.getDisciplina());
        System.out.println();

        System.out.println("Nome: " + prof4.getNome());
        System.out.println("Salario: " + prof4.getSalario());
        System.out.println("Disciplina: " + prof4.getDisciplina());
        System.out.println();

        System.out.println("Nome: " + prof5.getNome());
        System.out.println("Salario: " + prof5.getSalario());
        System.out.println("Disciplina: " + prof5.getDisciplina());
        System.out.println();

    }

}
