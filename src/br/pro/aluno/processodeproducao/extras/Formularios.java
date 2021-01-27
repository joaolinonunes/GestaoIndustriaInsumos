/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.aluno.processodeproducao.extras;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

/**
 *
 * @author Casa
 */
public class Formularios {
    public static void limparCampos(JInternalFrame form){
        for(Component c: form.getContentPane().getComponents()){
            if(c instanceof JTextField){
                ((JTextField) c).setText(null);
            }

            if(c instanceof JComboBox){
                ((JComboBox)c).setSelectedIndex(0);
            }   
        }
    }

    public static void tratarCampos(JInternalFrame form, boolean t){
        for(Component c: form.getContentPane().getComponents()){            
            if(c instanceof JTextField){
                ((JTextField) c).setEnabled(t);
            }
            if(c instanceof JComboBox){
                ((JComboBox) c).setEnabled(t);
            }
        }   
    }
}


