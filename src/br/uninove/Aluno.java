
package br.uninove;

public class Aluno extends Pessoa {
    
    private int ra;
    private Curso curso;
    // setRa;
    //String setNome;

    public Aluno(String nome, String cpf, int idade, int ra, Curso curso){
        super(nome, cpf, idade); // metodo super  pega as assinaturas da classe herdada (Clsse Pessoa)
        this.ra = ra;
        this.curso = curso;
    }
    
    public Aluno(){
        super();
    }
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
