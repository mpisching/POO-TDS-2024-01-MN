/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import domain.CupomFiscal;
import domain.ItemCP;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mpisc
 */
public class ImpressaoCP {
    //Na relaçao de dependência não se deve declarar um atributo da classe principal
    //private CupomFiscal cupomFiscal; //não confundir dependência com a associção de classes

    //O que caracteriza a dependência então no código?
    //É a declaração de um atributo da classe principal no parâmetro de um método.
    //Exemplo: o médodo imprimir a seguir...
    public static String imprimir(CupomFiscal cf) {
        StringBuilder sb = new StringBuilder();
        String formatText = "%-15s";//String com mínimo de 15 caracteres. O sinal de menos é  alinhamento a esquerda
        String formatValor = "%5.2f";

        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm:ss");

        sb.append("       ***** CUPOM FISCAL ******        ").append("\n");
        sb.append("Empresa........: ").append(cf.getEmpresa().getNome()).append("\n");
        sb.append("========================================").append("\n");
        sb.append("Número.........: ").append(cf.getCodigo()).append("\n");
        sb.append("Data...........: ").append(cf.getData().format(formatterData)).append("\n");
        sb.append("     Horario...: ").append(cf.getHora().format(formatterTime)).append("\n");
        sb.append("==========[ ITENS DO CUPOM ]============").append("\n");
        sb.append("Item\tDescricao\tqtd\tValor").append("\n");
        int i = 0;
        for (ItemCP itemCP: cf.getItensCP()) {
            sb.append(++i).append("\t").append(
                    String.format(formatText, (itemCP.getProduto().getNome().length()>15)?itemCP.getProduto().getNome().substring(0, 14):itemCP.getProduto().getNome())).append("\t")
                    .append(itemCP.getQuantidade()).append("\t")
                    .append(String.format(formatValor, itemCP.calcularTotal()))
                    .append("\n");
        }
        sb.append("----------------------------------------").append("\n");
        sb.append("TOTAL\t\t\t\t").append(String.format(formatValor, cf.calcularTotal())).append("\n");
        sb.append("========================================").append("\n");
        sb.append(" ****** OBRIGADO PELA PREFERÊNCIA ***** ").append("\n");
        return sb.toString();
    }
}
