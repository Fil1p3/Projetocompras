package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Compra {

    public ArrayList compras;

    public Compra() {
        compras = new ArrayList();
    }

    // create - salvar add
    public void salvar(String item) {
        compras.add(item);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso! uhull :D");
    }

    // read - listar
    public String listar() {
        String res = "";

        if (!compras.isEmpty()) {
            for (int i = 0; i < compras.size(); i++) {
                res += (i + 1) + "- " + compras.get(i) + "\n";
            }
        } else {
            res = "A Lista...ela está vazia...";
        }
        return res;
    }
    //delete

    public void Excluir(int indice) {
        if (!compras.isEmpty()) {

            if (indice > 0 && indice <= compras.size()) {
                compras.remove(indice - 1);
                JOptionPane.showMessageDialog(null, " Excluido com sucesso! YEY;)");
            } else {
                JOptionPane.showMessageDialog(null, "Código não existe! :0 :(");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Impossivel excluir! A lista tá vazia xiru grr");
        }
    }
    public void Editar(int indice,String elemento) {
        if (!compras.isEmpty()) {

            if (indice > 0 && indice <= compras.size()) {
                compras.set(indice - 1,elemento);
                JOptionPane.showMessageDialog(null, " Editado com sucesso! YEY;)");
            } else {
                JOptionPane.showMessageDialog(null, "Código não existe! :0 :(");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Impossivel Editar A lista tá vazia xiru grr");
        }
    }
}
