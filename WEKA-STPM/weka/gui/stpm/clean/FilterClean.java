/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package weka.gui.stpm.clean;

import java.util.List;

/**
 *
 * @author hercules
 */
public class FilterClean {

    
    private static  FilterClean instance;
    private List<String> listNomeTabelas;
    private Double  velocidadeMaxima;
    private Double  tempoMaximo;
    private Integer qtdePontos;
    private Double  porcentagem;



    private FilterClean() {
    }
    public static FilterClean getInstance(){
        if(instance == null){
            instance = new FilterClean();
        }
        return instance;
    }

    public String getListNomeTabelasStr() {
        StringBuilder b = new StringBuilder();
        for(String str: this.listNomeTabelas){
            if(str != null && !"".equals(str.trim())){
                b.append(str).append("; ");
            }
        }
        return b.toString();
    }

    public List<String> getListNomeTabelas() {
        return listNomeTabelas;
    }

    public void setListNomeTabelas(List<String> listNomeTabelas) {
        this.listNomeTabelas = listNomeTabelas;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Integer getQtdePontos() {
        return qtdePontos;
    }

    public void setQtdePontos(Integer qtdePontos) {
        this.qtdePontos = qtdePontos;
    }

    public Double getTempoMaximo() {
        return tempoMaximo;
    }

    public void setTempoMaximo(Double tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String toString(){
        StringBuilder b = new StringBuilder("");
        if(getPorcentagem() != null){
            b.append("pc_").append(getPorcentagem().intValue());
        }
        if(getQtdePontos()!=null){
            b.append("qt_").append(getQtdePontos().intValue());
        }
        if(getTempoMaximo()!=null){
            b.append("tm_").append(getTempoMaximo().intValue());
        }
        if(getVelocidadeMaxima()!=null){
            b.append("vm_").append(getVelocidadeMaxima().intValue());
        }
        return b.toString();
    }
}
