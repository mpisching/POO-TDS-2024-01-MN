/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package domain;

/**
 *
 * @author Z41R3
 */
import java.util.ArrayList;
import java.util.List;


public class Quarto {

   private List<Janela> janelas = new ArrayList<>();
   private  List<Porta> portas = new ArrayList<>();
   
   public Quarto(){
       
   }
    
   public void addJanela(Janela janela){
       janelas.add(janela);
   }
   
   public void addPorta(Porta porta){
       portas.add(porta);
   }
   
  
   public void abrirTodasJanelas(){
       for (Janela janela : janelas){
           janela.abrir(); 
       }
   }
   
   public void abrirJanelaBasculante(){
       for (Janela janela : janelas){
           janela.abrir(); 
       }
   }
       
   public void fecharTodasJanelas() {
       for (Janela janela : janelas) {
            janela.fechar();
        }
    }    
      
   public void abrirTodasPortas(){
       for (Porta porta : portas){
           porta.abrir(); 
       } 
   }
   
   public void fecharTodasPortas() {
       for (Porta porta : portas) {
            porta.fechar();
        }
    }    
   
   public void destravarTodasJanelas(){
       for (Janela janela : janelas){
           janela.destravar();
       }
   }
   
   public void travarTodasJanelas(){
       for (Janela janela : janelas){
           janela.travar();
       }
   }
   
    public void destravarTodasPortas(){
       for (Porta porta : portas){
           porta.destravar();
       }
   }
   
    public void travarTodasPortas(){
       for (Porta porta : portas){
           porta.travar();
       }
   }
    
   
}
