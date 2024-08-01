/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author PC
 */
public class Quarto {
    // O relacionamento: 
    // composição - unidirecional - Quarto recebe uma ou várias Janelas - Quarto recebe uma ou várias Portas.
    
    // composição - os objetos Porta e Janela só vão existir quando existir um Quarto,
    // logo esses tipos de objetos serão instaciadas na classe Quarto.
    
    // Não é possivel instanciar as classes Janela e Porta pois são abstratas
//    private Janela janela = new Janela();
//    private Porta porta = new Porta(); 
    
    // Para realizar o relacionamento exigido no diagrama, será necessário 
    // instaciar as subclasse(especializações) para existir os objetos Porta e Janela. 
    
    // Teste 1
    // Utilizando dos tipos de dados referentes as subclasses nós podemos instanciar 
    // as subclasses, assim teriamos o relacionamento de composição, mas note que 
    // o relaciomento seria então Quarto --> SubClasses
//    private JanelaBasculante janelaBasculante = new JanelaBasculante();
//    private JanelaCorrer janelaCorrer = new JanelaCorrer();
//    private Giratoria portaGiratoria = new Giratoria(); 
//    private Correr portaCorrer = new Correr();
//    private Basculante portaBasculante = new Basculante();
    
//    public Quarto(){  
//    }
//
//    public JanelaBasculante getJanelaBasculante() {
//        return janelaBasculante;
//    }
//
//    public JanelaCorrer getJanelaCorrer() {
//        return janelaCorrer;
//    }
//
//    public Giratoria getPortaGiratoria() {
//        return portaGiratoria;
//    }
//
//    public Correr getPortaCorrer() {
//        return portaCorrer;
//    }
//
//    public Basculante getPortaBasculante() {
//        return portaBasculante;
//    }
//    @Override
//    public String toString() {
//        return "Quarto{" + "janelaBasculante=" + janelaBasculante + ", janelaCorrer=" 
//        + janelaCorrer + ",\n portaGiratoria=" + portaGiratoria + ", portaCorrer=" + 
//        portaCorrer + ", portaBasculante=" + portaBasculante + '}';
//    }
// --------------------------------------------------------------------------------------    
    // Teste 2
    // Então para que seja Quarto --> Porta/Janela(SuperClasse), será utilizado
    // os tipos de dados Janela e Porta para as variaveis de instanciamento.
    // But o sistema está instanciando todas as SubClasse, logo, sempre que instanciar 
    // a classe Quarto, o mesmo terá UMA Janela Basculante, UMA Janela de Correr ...
    // UMA Porta Basculante.
//    private Janela janelaBasculante = new JanelaBasculante();
//    private Janela janelaCorrer = new JanelaCorrer();
//    private Porta portaGiratoria = new Giratoria();
//    private Porta portaCorrer = new Correr();
//    private Porta portaBasculante = new Basculante();
    
//    public Quarto(){  
//    }
//
//    public Janela getJanelaBasculante() {
//        return janelaBasculante;
//    }
//
//    public Janela getJanelaCorrer() {
//        return janelaCorrer;
//    }
//
//    public Porta getPortaGiratoria() {
//        return portaGiratoria;
//    }
//
//    public Porta getPortaCorrer() {
//        return portaCorrer;
//    }
//
//    public Porta getPortaBasculante() {
//        return portaBasculante;
//    }
//    @Override
//    public String toString() {
//        return "Quarto{" + "janelaBasculante=" + janelaBasculante + ", janelaCorrer=" + 
//        janelaCorrer + ",\n portaGiratoria=" + portaGiratoria + ", portaCorrer=" + 
//        portaCorrer + ", portaBasculante=" + portaBasculante + '}';
//    }
// --------------------------------------------------------------------------------------  
    // Teste 3
    // Para que o sistema instancie apenas as SubClasse desejas, sendo necessário 
    // pelo menos UMA Porta e UMA Janela, faremos da seguinte forma.
    // Nesse caso conseguimos determinar qual tipo de dado foi instanciado junto 
    // da classe Quarta. Agora falta fazer a relação de Quarto contem UMA ou VARIAS
    // Portas/Janelas.
//    private Janela janela;
//    private Porta porta;
//
//    public Quarto() {
//        instanceJanelaDefault();
//        instancePortaDefault();
//    }
//    
//    public Quarto(String janela,String porta){
//        this();
//        newInstaceJanela(janela);
//        newInstacePortaa(porta);
//    }
//    
//    private void instanceJanelaDefault(){
//        this.janela = new JanelaCorrer();
//    }
//    
//    private void instancePortaDefault(){
//        this.porta = new Correr();
//    }
//    
//    private void newInstaceJanela(String janela){
//        if(janela == "JB"){
//            this.janela = new JanelaBasculante();
//        }
//    }
//    
//    private void newInstacePortaa(String porta){
//        if(porta == "PG"){
//            this.porta = new Giratoria();
//        }else if(porta == "PB"){
//            this.porta = new Basculante();
//        }
//    }
//
//    public Janela getJanela() {
//        return janela;
//    }
//
//    public Porta getPorta() {
//        return porta;
//    }
//
//    @Override
//    public String toString() {
//        return "Quarto{" + "janela=" + janela + ", porta=" + porta + '}';
//    }
// --------------------------------------------------------------------------------------    
    // Teste 4 
    // Para que Quarto tenha UMA ou VARIAS Portas/Janelas vamos usar da matriz
    // dinâmica. Criando uma para cada tipo de dado generico uma matriz dinamica:         
    private List <Janela> janelas = new ArrayList<>();
    private List <Porta> portas = new ArrayList<>();
    // Metodos construtor irá instanciar as classes porta e janela 
    // assim como solicitado pela relação de composição.  
    public Quarto() {
        instanceJanelaDefault();
        instancePortaDefault();
    }
    // Sobrecarga do metodo para que haja a possibilidade de escolher os tipos especializados
    public Quarto(String tipoJanela, String tipoPorta){
        this();
        selectInstaceJanela(tipoJanela);
        selectInstacePorta(tipoPorta);
    }
    // Instancias padrões para caso não escolha o tipo.
    private void instanceJanelaDefault(){
        Janela janela = new JanelaCorrer();
        this.janelas.add(janela);
    }
    
    private void instancePortaDefault(){
        Porta porta = new Correr();
        this.portas.add(porta);
    }
    // Instanciamentos por seleção, para caso queria escolher o tipo.
    private void selectInstaceJanela(String tipoJanela){
        if(tipoJanela == "Janela Basculante"){
            this.janelas.remove(0);
            Janela janela = new JanelaBasculante();
            this.janelas.add(janela);
        }else{
            valorNaoIdentificado();
        }
    }
    
    private void selectInstacePorta(String tipoPorta){
        if(tipoPorta == "Porta Giratoria"){
            this.portas.remove(0);
            Porta porta = new Giratoria();
            this.portas.add(porta);
        }else if(tipoPorta == "Porta Basculante"){
            this.portas.remove(0);
            Porta porta = new Basculante();
            this.portas.add(porta);
        }else{
            valorNaoIdentificado();
        }
    }
    // Adicionar novas instancias de portas e janelas
    public void addNewInstanceJanela(String novaJanela){
        if(novaJanela == "Janela de Correr"){
            instanceJanelaDefault();
        }else if(novaJanela == "Janela Basculante"){
            Janela janela = new JanelaBasculante();
            this.janelas.add(janela);
        }else{
            valorNaoIdentificado();
        }
    }
    
    public void addNewInstancePorta(String novaPorta){
        if(novaPorta == "Porta de Correr"){
            instancePortaDefault();
        }else if(novaPorta == "Porta Giratoria"){
            Porta porta = new Giratoria();
            this.portas.add(porta);
        }else if(novaPorta == "Porta Basculante"){
            Porta porta = new Basculante();
            this.portas.add(porta);
        }else{
            valorNaoIdentificado();
        }     
    }
    // Remover instancias de portas e janelas 
    public void removeInstanceJanela(int index){
        // Se tamanho do vetor for 1 não será possivel remover
        if(this.janelas.size() == 1){
            System.out.println("Não é possivel reitiar!! "
            + "\nO quarto necessita de pelo menos uma janela");
        // Se inserir um valor menor que zero ou maior que o vetor print
        }else if(index < 0 || this.portas.size() < index){
            System.out.println("Endereço não encontrada!");
        }else{
            //remover de acordo com o indeice selecionado
            this.janelas.remove(index);
        }
    }
    
    public void removeInstancePorta(int index){
        // Se tamanho do vetor for 1 não será possivel remover
        if(this.portas.size() == 1){
            System.out.println("Não é possivel reitiar!! "
            + "\nO quarto necessita de pelo menos uma porta");
        // Se inserir um valor menor que zero ou maior que o vetor print
        }else if(index < 0 || this.portas.size() < index){
            System.out.println("Endereço não encontrada!");
        }else{
            //remover de acordo com o indeice selecionado
            this.portas.remove(index);
        }
    }
    
    // Acessar as classes
    public List<Janela> getJanelas() {
        return janelas;
    }
    
    public List<Porta> getPortas() {
        return portas;
    }

    // Retornar os valores armazenados
    @Override
    public String toString() {
        return "Quarto{" + " portas=" + portas + " janelas=" + janelas + '}';
    }
    
    // Metodo extra
    private void valorNaoIdentificado(){
        System.out.println("Nome não encontrado, digite novamente!!");
    }
 
}
