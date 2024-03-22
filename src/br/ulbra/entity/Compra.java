
package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Compra {
    public ArrayList compras;
    public Compra(){
        compras = new ArrayList();
    }
    // create - salvar add
    public void salvar(String item){
        compras.add(item);
        JOptionPane.showMessageDialog(null,
                "Salvo com sucesso!");
    }
    //read - listar
    public String listar(){
        String res = "";
        if(!compras.isEmpty()){
            for(int i=0;i<compras.size();i++){
               res+= (i+1)+" - "+compras.get(i)+"\n";
            }
        }else{
            res = "Lista vazia!";
        }
        return res;
    }
    //delete
    public void excluir(int indice){
        if(!compras.isEmpty()){
            if(indice>0 && indice<=compras.size()){
            compras.remove(indice-1);
            JOptionPane.showMessageDialog(null,"Excluído com sucesso!");
            }else{
            JOptionPane.showMessageDialog(null, "Código não existe!");
            }}else{
            JOptionPane.showMessageDialog(null,
              "Impossivel excluir, lista está vazia!");}
    }
    public void alterar(int indice, String elemento){
        if(!compras.isEmpty()){
            if(indice>0 && indice<=compras.size()){
                compras.set(indice-1, elemento);
                JOptionPane.showMessageDialog(null,
                        "Alterado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null,
                        "Código não existe!");
            }}else{
            JOptionPane.showMessageDialog(null,
              "Impossivel Alterar, lista está vazia!");
        }
    }
    
}
