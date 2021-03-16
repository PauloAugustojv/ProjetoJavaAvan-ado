
package br.uninove;

public class Principal {
    public static void main(String[] args) {
        
        
       Pessoa p = new Pessoa();
       p.setNome("Paulo Augusto");
       p.setCpf("54254225");
       p.setIdade(44);
       
       Pessoa p2 = new Pessoa("Paulo Augusto","505.823.818-78", 20);
       
       Aluno a1 = new Aluno();
       a1.setNome("Augustinho");
       a1.setRa(1234);
       a1.setCurso(new Curso("Medicina",2000));
       
       Aluno a2 = new Aluno("edmundo","524.424.547-78", 60, 50, new Curso("SI",2000));
       
       
    }
}
/*DESAFIO DO TIO;
CRIAR UMA CLASSE CHAMADA DISCIPLINA COM OS ATRIBUTOS:
-NOME
-CH
-EMENTA - Grande texto - obetivos do curso.

criar a classe professor com;
-matricula
-ch;

*/