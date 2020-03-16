package aula11;

public class Aula11 {
    
    public static void main(String[] args) {

        //Um visitante
        Visitante v1 = new Visitante();
        v1.setNome("José");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        //Um aluno
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        //Um aluno bolsista
        Bolsista b1 = new Bolsista();
        b1.setNome("Juvenal");
        b1.setIdade(30);
        b1.setMatricula(1112);
        b1.setBolsa(12.f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());

        //Um aluno cursando Técnico
        Tecnico t1 = new Tecnico();
        t1.setNome("Tamires");
        t1.setIdade(20);
        t1.setSexo("F");
        t1.setRegistro(31232);
        t1.setCurso("Enfermagem");
        t1.praticar();
        
    }
    
}
