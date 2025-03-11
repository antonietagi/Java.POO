package uscs;

public class Aluno {
    private String name; //São atributos
    private int code;
    private String id;
    private char sex;
    private double grade1;
    private double grade2;
    private double grade3;


// construtor serve para inicializar a variável.
// metodo fica dentro da classe, eh o comportamento da classe.

    public Aluno(String nome, int codmat, String cpf, char sexo, double nota1, double nota2, double nota3); //parametro {
        this.name = nome; //Quando você usa this.name, está se referindo ao atributo da classe Aluno
        this.code = codmat;
    //parametro mesmo nome de atributo this.
        this.sex = sexo;
        this.grade1 = nota1;
        this.grade2 = nota2;
        this.grade3 = nota3;
}

public void imprimeAluno() {
    System.out.println("Nome: " + name);
    System.out.println("Código de Matrícula: " + code);
    System.out.println("CPF: " + id);
    System.out.println("Sexo: " + sex);
    System.out.println("Nota 1: " + grade1);
    System.out.println("Nota 2: " + grade2);+
            System.out.println("Nota 3: " + grade3);

}

public void imprimeSexo() {
    System.out.println("Nome: " + name);
    if (sex == 'F') {
        System.out.println("Feminino");
    } else if (sex == 'M') {
        System.out.println("Masculino");
    }else{
        System.out.println("Erro");
    }
}

public double MediaAluno() {
    double menor; //declarar o menor

    if (grade1 <= grade2 && grade1 <= grade3) {
        menor = grade1;
    }else if (grade2 <= grade1 && grade2 <= grade3) {
        menor = grade2;
    }else{
        menor = grade3;
    }
    return (grade1 + grade2 + grade3 - menor)/2;
}

public String Resultado() {
    double media = MediaAluno();
    if(media>=6){
        return "Aprovado";
    }else{
        return "Reprovado";
    }
}

}
