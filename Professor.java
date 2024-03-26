CadastroProfessor.java

public class Professor {
    private String nome;
    private double salario;
    private String disciplina;

    public Professor() {
        this.nome = "";
        this.salario = 0;
        this.disciplina = "";
    }

    public Professor(String nome, double salario, String disciplina) {
        this.nome = nome;
        this.salario = salario;
        this.disciplina = disciplina;

    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {

        //este é o salario minimo do Brasil então coloquei para que se salario for menor que o salario minimo dar errado//
        if (salario < 1412) {
            System.out.println("Este salario é menor que o minimo");
            return;
        }

        //o teto salarial do Brasil eu acho que é 41000 então coloquei assim//
        else if (salario > 41650) {
            System.out.println("Este salario é maior que o teto salarial do Brasil");
            return;
        }
        this.salario = salario;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}