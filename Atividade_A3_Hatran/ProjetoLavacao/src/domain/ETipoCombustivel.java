/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package domain;

/**
 *
 * @author PC
 */
public enum ETipoCombustivel { // definir padrões de escolha. LIMITAR
    GASOLINA, ETANOL, FLEX, DIESEL, GNV, OUTRO; //padrão
    
    /* O desenvolvimento abaixo é para diversificar mais o ENUM
    GASOLINA(1,"Gasolina","GS"),
    ETANOL(2,"Etanol","ET"),
    FLEX(3,"Flex","FL"),
    DIESEL(4,"Diesel","DS"),
    GNV(5,"GNV","GNV"),
    OUTRO(6, "Outro", "OU");
    
    private int id;
    private String letraMinuscula;
    private String Abreviacao;
    
    private ETipoCombustivel(int id, String letraMinuscula, String Abreviacao){
        this.id = id;
        this.letraMinuscula = letraMinuscula;
        this.Abreviacao = Abreviacao;
    }

    // como ja possui um construtor, vamos deixar de incrementar o metodo set, utilizando apenas do get para poder vizualizar o conteudo
    
    public int getId() {
        return id;
    }

    public String getLetraMinuscula() {
        return letraMinuscula;
    }

    public String getAbreviacao() {
        return Abreviacao;
    }*/
    
}
