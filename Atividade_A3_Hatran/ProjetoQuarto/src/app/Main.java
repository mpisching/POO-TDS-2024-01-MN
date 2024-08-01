/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Quarto;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        // Teste 1 Quarto --> Subclasse. 
        // Tipo de dado referente a cada SubClasse. 
        // Instanciando tipo de objeto Quarto e todas as SubClasses de Porta e Janela.
//        Quarto quarto = new Quarto();    
//        System.out.println(quarto);
//        quarto.getJanelaBasculante().abrir();

        // Teste 2 Quarto --> SuperClasses.
        // Tipo de dado referente as SuperClasses. 
        // Instanciando tipo de objeto Quarto e todas as SubClasses de Porta e Janela.
//        Quarto quarto = new Quarto();
//        System.out.println(quarto);
//        quarto.getJanelaBasculante().abrir();
       
        // Teste 3 Quarto --> SuperClasses.
        // Tipo de dado referente as SuperClasses.
        // Instanciando tipo de objeto Quarto e apenas as SubClasses selecionadas ou 
        // por padrão.
        // Padrão
//        Quarto quarto = new Quarto();
//        System.out.println(quarto);
//        quarto.getJanela().abrir();
        // Escolha
//        Quarto quarto = new Quarto("JB","PB");
//        System.out.println(quarto);
//        quarto.getJanela().abrir();

        // Teste 4 Quarto --> SuperClasses.
        // Tipo de dado referente as SuperClasses. 
        // Instanciando tipo de objeto Quarto e apenas as SubClasses de Porta e Janela
        // padrões, ou que foram selecionadas, ou que foram adicionadas .
        // Instanciar UMA ou VARIAS vezes a mesma ou diferentes SubClasse.
        // Padrão
        Quarto quarto = new Quarto();
        System.out.println(quarto);
        // Testando metodos presentes nas subclasses.
        quarto.getJanelas().get(0).abrir();
        quarto.getPortas().get(0).fechar();
        quarto.getPortas().get(0).travar();
        // Adiconando mais um intandica de janela e porta.
        quarto.addNewInstanceJanela("Janela de Correr");
        quarto.addNewInstancePorta("Porta Giratoria");
        quarto.getPortas().get(1).destravar();
        quarto.getPortas().get(1).abrir();
        quarto.addNewInstanceJanela("Janela Basculante");
        System.out.println(quarto);
        quarto.getJanelas().get(2).abrir();
        // Removendo endereço que não existe.
        quarto.removeInstanceJanela(3);
        // Removendo endereço de objetos.
        // Por ser uma lista dinamica, ela diminui ou aumenta o tamanho do 
        // vetor conforme adiciona ou retira um endereço.
        quarto.removeInstanceJanela(0);
        System.out.println(quarto);
        // Logo percebesse que utilizo do mesmo indece para remover, pois 
        // se remover o endereço de indice 0, o indece 1 passa a ser o 0.
        quarto.removeInstanceJanela(0);
        System.out.println(quarto);
        quarto.removeInstanceJanela(0);
        System.out.println(quarto);
        // Escolha
//        Quarto quarto = new Quarto("Janela Basculante");
//        System.out.println(quarto);
//        quarto.getJanelas().get(0).abrir();
    }
}
