public class CadastroAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("");
        aluno1.setIdade(0);
        aluno1.setCurso("");

        Aluno aluno2 = new Aluno("Joao", 25, "Desenvolvimento de Sistemas");
        Aluno aluno3 = new Aluno("Victor", 19, "Desenvolvimento de Sistemas");
        Aluno aluno4 = new Aluno("Pimentel", 23, "Desenvolvimento de Sistemas");
        Aluno aluno5 = new Aluno("Enzo", 21, "Desenvolvimento de Sistemas");

        System.out.println("Aluno 1 com contrutor vazio e setters");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Curso: " + aluno1.getCurso());
        System.out.println();

        System.out.println("Aluno 2 com contrutor com parametros");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Curso: " + aluno2.getCurso());
        System.out.println();

        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Idade: " + aluno3.getIdade());
        System.out.println("Curso " + aluno3.getCurso());
        System.out.println();

        System.out.println("Nome: " + aluno4.getNome());
        System.out.println("Idade: " + aluno4.getIdade());
        System.out.println("Curso " + aluno4.getCurso());
        System.out.println();

        System.out.println("Nome: " + aluno5.getNome());
        System.out.println("Idade: " + aluno5.getIdade());
        System.out.println("Curso " + aluno5.getCurso());

    }
}