import br.com.escola.modelos.Aluno;
import br.com.escola.modelos.Materia;
import br.com.escola.modelos.Turma;

import java.util.Collections;

public class Principal {
    public static void main(String[] args) {

        Turma turma1 = new Turma("1234","Turma A" );

        Materia materia1 = new Materia("Matemática");
        Materia materia2 = new Materia("Inglês");
        Materia materia3 = new Materia("Biologia");
        Materia materia4 = new Materia("Física");
        Materia materia5 = new Materia("Programação");

        turma1.setMaterias(materia1);
        turma1.setMaterias(materia2);
        turma1.setMaterias(materia3);
        turma1.setMaterias(materia4);
        turma1.setMaterias(materia5);

        Aluno aluno1 = new Aluno("Luiz Gustavo");
        aluno1.setTurma(turma1);
        Aluno aluno2 = new Aluno("Amanda");
        Aluno aluno3 = new Aluno("Roberto");

        System.out.println(aluno1.toString());


        turma1.setAlunos(aluno1);
        turma1.setAlunos(aluno2);
        turma1.setAlunos(aluno3);



    }
}
