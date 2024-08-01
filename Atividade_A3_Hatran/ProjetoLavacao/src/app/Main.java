/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;


import domain.Cliente;
import domain.Cor;
import domain.ETipoCombustivel;
import domain.ECategoria;
import domain.Marca;
import domain.Modelo;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Veiculo;

/**
 *
 * @author PC
 */
public class Main {
    // instânciamento --> objeto
    public static void main(String[] args) {
        // MARCA
        // instânciando marca == representação do objeto marca no mundo virtual
        Marca mc1 = new Marca("Porsche");       //
        mc1.setId(1);                           //
        Marca mc2 = new Marca("BMW");           //      Mesmos atributos, mas valores diferentes --> 
        mc2.setId(2);                           //          estado --> como se encontra o objeto
        Marca mc3 = new Marca("Lamborghini");   //
        mc3.setId(3);                           //
        // instânciando marca
//        mostrarDadosMarca(mc1);
//        mostrarDadosMarca(mc2);
//        mostrarDadosMarca(mc3);
//        System.out.println("");
        
        // COR
        // instânciando cor == representação do objeto cor no mundo virtual
        Cor c1 = new Cor("Preto");
        c1.setId(1);
        Cor c2 = new Cor("Branco");
        c2.setId(2);
        Cor c3 = new Cor("Verde");
        c3.setId(3);
        // registros cor        
//        mostrarDadosCor(c1);
//        mostrarDadosCor(c2);
//        mostrarDadosCor(c3);
//        System.out.println("");
        
        // MODELO
        // instânciando modelo == representação do objeto modelo no mundo virtual
        Modelo md1 = new Modelo("Taycan", mc1);
        md1.setId(1);
        md1.setECategoria(ECategoria.PADRAO);
        Modelo md2 = new Modelo("X1", mc2);
        md2.setId(2);
        md2.setECategoria(ECategoria.MEDIO);
        Modelo md3 = new Modelo("Huracan", mc3);
        md3.setId(3);
        md3.setECategoria(ECategoria.PADRAO);
        // MODELO --> MOTOR
        /* instânciando motor. OBS: veja que para atribuir valor aos atributos
           da classe Motor é necessario acessar atraves da classe Modelo.*/
        md1.getMotor().setPotencia(761);
        md1.getMotor().setTipoCobustivel(ETipoCombustivel.OUTRO);
        md2.getMotor().setPotencia(204);
        md2.getMotor().setTipoCobustivel(ETipoCombustivel.GASOLINA);
        md3.getMotor().setPotencia(640);
        md3.getMotor().setTipoCobustivel(ETipoCombustivel.GASOLINA);
        // registros motor
//        mostrarDadosMotor(md1);
//        mostrarDadosMotor(md2);
//        mostrarDadosMotor(md3);
//        System.out.println("");
//        // registros modelo
//        mostrarDadosModelo(md1);
//        mostrarDadosModelo(md2);
//        mostrarDadosModelo(md3);
//        System.out.println("");
        //
        // VEICULO
        // instânciando veiculo == representação do objeto modelo no mundo virtual       
        Veiculo v1 = new Veiculo("AAA-111", md1);
        v1.setId(1);
        v1.setObservacoes("Esportivo");
        v1.setCor(c1);
        Veiculo v2 = new Veiculo("BBB-222", md2);
        v2.setId(2);
        v2.setObservacoes("SUV");
        v2.setCor(c2);
        Veiculo v3 = new Veiculo("CCC-333", md3);
        v3.setId(3);
        v3.setObservacoes("Esportivo");
        v3.setCor(c3);
        // registros veiculo --> Null.PointerException : veiculo possui o atributo cliente, logo, se printar
        // o veiculo antes de cliente, o mesmo será null
        /*mostrarDadosVeiculo(v1); 
        mostrarDadosVeiculo(v2);   
        mostrarDadosVeiculo(v3); 
        System.out.println("");*/
        
        
        // CLIENTE    
        //instânciando pessoafisica
        /*
        PessoaFisica pf1 = new PessoaFisica(); 
        pf1.setCpf("111.111.111-11");
        pf1.setDataNascimento("2000-04-01");
        pf1.setId(1);
        pf1.setNome("Ana");
        pf1.setCelular("91111-1111");
        pf1.setEmial("ana@gmail.com");
        pf1.getPontuacao().adicionar(0);
        pf1.add(v1);     
        /*PessoaFisica pf2 = new PessoaFisica("222.222.222-22", "2000-04-01");
        pf2.setId(2);
        pf2.setNome("Bruno");
        pf2.setCelular("92222-2222");
        pf2.setEmial("bruno@gmail.com");
        pf2.getPontuacao().adicionar(0);
        pf2.add(v2);
        // registros pessoa fisica
        mostrarDadosPessoaFisica(pf1);
        mostrarDadosPessoaFisica(pf2);
        */
        //instânciando pessoajuridica 
        /*
        PessoaJuridica pj = new PessoaJuridica("22.222555/2255-55", "222.222.555.555", 5, "Bruna", "92222-5555", "bruna@gmail.com", "2024-04-24");
        pj.getPontuacao().adicionar(0);
        // Testando a lista
        pj.add(v2);
        pj.add(v3);
        // registros pessoa juridica
        mostrarDadosPessoaJuridica(pj);
        */
        
        // POLIMORFISMO
        // --> Generico
        Cliente cliente = new PessoaFisica("333.333.333-33", "2000-04-01", 3, "Carlos", "93333-3333", "carlos@gmail.com", "2024-04-24");
        cliente.getPontuacao().adicionar(30);
        cliente.add(v1);
        mostrarDadosCliente(cliente);
        /*cliente = new PessoaJuridica("22.222555/2255-55", "222.222.555.555", 5, "Bruna", "92222-5555", "bruna@gmail.com", "2024-04-24");
        cliente.getPontuacao().adicionar(50);
        cliente.add(v2);
        cliente.add(v3);*/
 
        //especificarInstancia(cliente); //downcast - do supertipo para o subtipo
        //mostrarDadosCliente(cliente);
        
        // --> Especializado
        PessoaJuridica pj = new PessoaJuridica("22.222555/2255-55", "222.222.555.555", 5, "Bruna", "92222-5555", "bruna@gmail.com", "2024-04-24");
        pj.getPontuacao().adicionar(50);
        pj.add(v2);
        pj.add(v3);
        
        //generalizarInstancia(pj); //upcast - do subtipo para o supertipo
        mostrarDadosCliente(pj);
        mostrarDadosCliente(pj, "Cliente prioritário.");
    }
    
    private static void mostrarDadosMarca(Marca mc){
        System.out.println(mc);
    }
    
    private static void mostrarDadosCor(Cor c){
        System.out.println(c);
    }
    
    private static void mostrarDadosMotor(Modelo md){
        System.out.println(md.getMotor().toString());
        // para retornar o registro do objeto motor é necessário acessar atravse da classe Modelo
    }
   
    private static void mostrarDadosModelo(Modelo md){
        System.out.println(md);
    }
    
    /*private static void mostrarDadosVeiculo(Veiculo v){
        System.out.println(v);
    }*/
    
    /*private static void mostrarDadosPessoaFisica(PessoaFisica pf){
        System.out.println(pf);
    }
    
    private static void mostrarDadosPessoaJuridica(PessoaJuridica pj){
        System.out.println(pj);
    }*/
     
    /* 
        POLIMORFISMO == variação de um tipo de dado(classe) a partir de uma varialvel de referência, utilizando de duas 
        ou mais instancias proporcionadas por um relação de herança.
        Ex: A gente informa o tipo de dado(classe) que vamos armazenar na memória ram, para encontra-la terá um
        endereço(variavel de referência) e informamos um novo(new) instanciamento desse tipo de dado(classe) == objeto,
        mas por se tratar de uma superclasse(GENERICA E ABSTRATA) utilizamos de suas subclasses(ESPECIALIZAÇÃO) para
        instancia, retornando um objeto mais especifico. 
    */ 
    private static void generalizarInstancia(PessoaJuridica pj){
        // Atribuição de uma instância de uma classe mais específica para uma mais genérica
        Cliente cliente = pj; //upcast - do subtipo para o supertipo
        especificarInstancia(cliente);
    }
    
    private static void especificarInstancia(Cliente cliente){ 
        // Atribuição de uma instância de uma classe mais genérica para uma mais específica
        if (cliente instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica)cliente; //downcast - do supertipo para o subtipo
        } else {
            PessoaJuridica pj = (PessoaJuridica)cliente; //downcast - do supertipo para o subtipo
        }
        mostrarDadosCliente(cliente); 
    }
      
    private static void mostrarDadosCliente(Cliente cliente){ 
        System.out.println(cliente.getDados());
//        if (cliente instanceof PessoaFisica) {
//            System.out.println(((PessoaFisica)cliente).getDados());  
//        } else {
//            System.out.println(((PessoaJuridica)cliente).getDados("Cliente dono de uma locação de carros"));  
//        }
    }
    
    private static void mostrarDadosCliente(Cliente cliente, String msg){ 
        System.out.println(cliente.getDados(msg));
    }
    
}
