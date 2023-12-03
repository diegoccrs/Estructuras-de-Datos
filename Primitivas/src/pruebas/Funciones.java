package pruebas;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author reina
 */
public class Funciones {

    public int NumtoString() {
        int y = 0;
        String x;
        x = JOptionPane.showInputDialog("Coloca un numero: ");
        boolean Valido = true;
        while (Valido) {
            try {
                y = Integer.parseInt(x);
                Valido = false;

            } catch (Exception e) {
                System.out.println("No se coloco un numero, intente otra vez");
                break;
            }

        }
        return y;
    }

    public static boolean isNumber(char letra) {
        boolean Es = false;
        try {
            String p = Character.toString(letra);
            int n = Integer.parseInt(p);
            Es = true;
        } catch (Exception e) {

        }
        return Es;
    }

    public static boolean isOperand(char O) {
        boolean Es = false;
        String compare = String.valueOf(O);
        String[] oper = {"*", "+", "-", "/", "(", ")", "^"};
        for (int i = 0; i < oper.length; i++) {
            if (compare.equals(oper[i])) {
                Es = true;
            }
        }
        return Es;
    }



}
