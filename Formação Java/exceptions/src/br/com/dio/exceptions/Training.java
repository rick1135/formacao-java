package br.com.dio.exceptions;

import javax.swing.JOptionPane;

public class Training {
    public static void main(String[] args) {
        int[] numeros = new int[] {10, 20, 30, 100};
        int[] peso = new int[] {2, 0, 4};
        Matematica mat = new Matematica();
        System.out.println("numeros: ");
        for (int i = 0; i < numeros.length; i++){
            try{
                // int res = numeros[i] / peso[i];
                // System.out.println(numeros[i] + " / " + peso[i] + " = " + res);
                
                mat.dividir(numeros[i], peso[i]);
                System.out.println("fim do loop");
            } catch (ArithmeticException erro){
                JOptionPane.showMessageDialog(null, "Erro ao dividir por zero " + erro.getMessage());
            } catch (ArrayIndexOutOfBoundsException erro){
                JOptionPane.showMessageDialog(null, "Posição do array inválida " + erro.getMessage());
            } finally {
                System.out.println("fim do bloco try");
            }
        }
        System.out.println("mensagem final");
    }
}
