public class Aluno {
    private String nome;
    private int idade;
    private String curso;

    public Aluno() {
        this.nome = "";
        this.idade = 0;
        this.curso = "";
    }

    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade não pode ser negativa");
            return;
        }
        else if (idade > 150) {
            System.out.println("Idade não pode ser maior que 150");
            return;
        }
            this.idade = idade;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
Aluno.java
a
a
a
a
a
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
