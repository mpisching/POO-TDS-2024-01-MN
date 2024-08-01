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
// Toda classe concreta que implementa essa interface precisa ter os metodos presentes nela.
public interface ICliente {
    // Metodos Abstratos - Por ser uma interface os metodos ja são abstratos, 
    // mas coloquei "abstract" para reforçar a ideia.
    public String getDados();
    public String getDados(String Observacao);
    // abstract - declarar um metodo como abstract, significa que nao foi
    // implementado, não podendo ser chamado.
    // String - haverá retorno do tipo de dado String.
    // ( ) - Sem argumentos.
    // (String Observacao) - Recebe argumentos do tipo String.
    //  ; - Vai uma ponto e virgula no final, pois como é um metodo abstrato, 
    // não será implementado nada. Pelo menos não aqui ;)
}
