/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
public class Modelo { 
    // Atributos
    private int id;
    private String descricao;
    // Atributos que recebem um tipo de dado referente as classes criadas
    private Marca marca; 
    private Motor motor; // agregação composição
    private ECategoria categoria = ECategoria.PADRAO; // associação com a classe enum categoria, ja vem com um valor predefinido


    // Metodos Especiais
    // --> Construtor --> método que é executado automaticamente quando uma classe é instanciada (objeto é criado).
    public Modelo() { // metodo construtor original
        powerMotor(); 
    /* Ao executar o medoto construtor, é chamado o metodo powerMotor, para que seja levado a classe Motor, 
       que deve ser definida junto da classe Modelo, pois como determinado no diagrama de classes, 
       sua associação é por agragação composta, logo motor não existe sem modelo.
       Fica mais evidente a questão da classe Motor "pertencer" a classe Modelo ao visualizar a classe Main, 
       que não é necessario importar a classe Motor */ 
    }

    public Modelo(String descricao, Marca marca){
        this(); // utilizar do metodo ja existente para chamar o metodo powerMotor
        this.descricao = descricao;
        this.marca = marca;    
    }
    
    // --> Getters --> obter de forma indireta os valores armazenados dentro do objeto.
    public int getId() {
        return id;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public Marca getMarca() {
        return marca;
    }

    public Motor getMotor(){
        return motor;
    }
    
    public ECategoria getECategoria(){
        return categoria;
    }
    
    // --> Setters --> permite configurar indiretamente valores dentro de um objeto (atributos).
    public void setId(int id) {
        this.id = id;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public void setECategoria(ECategoria categoria){
        this.categoria = categoria;
    }
    
    // --> Metodos 

    private void powerMotor(){ // metodo para construir o objeto motor através da classe Modelo
        motor = new Motor(); 
        /* Dessa forma, construindo a associação por agregação composta, que por meio da classe Modelo podemos operar a classe Motor,
        como se os atributos da classe Motor pertencessem a classe Modelo, mas obtendo-se como produto final dois objetos distintos.
        Assim como o objeto motor é criado pela classe Motor através da classe Modelo, o mesmo deixará de existir quando o objeto criado pela 
        classe Modelo for apagado.
        EX: 
            class Main {
        
                Se fosse uma classe com associação padrao seria:
        
                motor.setPotencia();
        
                Agora com é por agregação composição:
        
                modelo.getMotor().setPotencia();
        
                Como se os atributos da classe Motor "pertencessem" a classe Modelo.
        
                Observasse que utilizamos do metodo "getMotor" para "visualizarmos" a classe Motor e entao "setPotencia" para atribuir os dados
            }
        */ 
    }
  
    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + ", descricao=" 
                + descricao + ", marca=" + marca.getNome() 
                + ", categoria=" + categoria 
                + ", motor=" + motor.getPotencia() + "CV "
                + ", TipoCombustivel=" + motor.getTipoCobustivel() +'}';
    }
    
    
}
