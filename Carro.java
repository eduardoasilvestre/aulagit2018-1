/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e07022017;

/**
 *
 * @author EDYA
 */
public class Carro {

    int ano;
    String  fabricante;
    String modelo;
    boolean ligado = false;
    int marcha=0;
    int velocidade = 0;
    
    void ligar(int x) {
        marcha = 1;
        ligado = true;
        System.out.println("Carro ligado " + modelo);
        
    }
            
    void desligar() {
        if (ligado == true) {
            ligado = false;
            System.out.println("Desligando o carro " + modelo);
        } else {
            System.out.println("Carro não está ligado manezão...");
        }
    }
    void alteraVelocidade(int vec) {
        if(ligado) {
            velocidade += vec;

            if (velocidade >= 0 && velocidade <=40) {
                marcha = 2;
            } else if (velocidade >= 41 && velocidade <=60) {
                marcha = 3;
            } else if (velocidade >= 61 && velocidade <=80) {
                marcha = 4;
            } else {
               marcha= 5;
            }
        }
    }
    
}
