/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
// A interface é tratada como um regra para o desenvolvimento das outras class.
// Toda classe que implementa essa interface precisa ter os metodos presentes nela.
public interface ITravamento {
    // Metodos Abstratos - Por ser uma interface os metodos ja são abstratos, 
    // mas coloquei "abstract" para reforçar a ideia.
    public abstract void travar();
    public abstract void destravar();
    // abstract - declarar um metodo como abstract, significa que nao foi
    // implementado, não podendo ser chamado.
    // void - Sem retorno, vazio.
    // ( ) - Sem argumentos.
    //  ; - Vai uma ponto e virgula no final, pois como é um metodo abstrato, 
    // não será implementado nada. Pelo menos não aqui ;)
}
