/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package desafio.dio.poo;

import desafio.dio.poo.dominio.Bootcamp;
import desafio.dio.poo.dominio.Curso;
import desafio.dio.poo.dominio.Dev;
import desafio.dio.poo.dominio.Mentoria;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição do curso de Java ");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript ");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos da Maria" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos da Maria" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos da Maria" + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());

        System.out.println("-------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos do João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos do João" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos do João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
