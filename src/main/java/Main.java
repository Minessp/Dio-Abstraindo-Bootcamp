import org.msp.desafio.domain.Bootcamp;
import org.msp.desafio.domain.Curso;
import org.msp.desafio.domain.Dev;
import org.msp.desafio.domain.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso de JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(java.time.LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev paulo = new Dev();
        paulo.setNome("Paulo");
        System.out.println("Conteudos inscritos: " + paulo.getConteudosInscritos());
        paulo.inscreverBootcamp(bootcamp);
        paulo.progredir();
        System.out.println("Conteudos inscritos: " + paulo.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + paulo.getConteudosConcluidos());

        Dev gabriel = new Dev();
        gabriel.setNome("Gabriel");
        System.out.println("Conteudos inscritos: " + gabriel.getConteudosInscritos());
        gabriel.inscreverBootcamp(bootcamp);
        gabriel.progredir();
        System.out.println("Conteudos inscritos: " + gabriel.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + gabriel.getConteudosConcluidos());
    }
}
