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
public class TesteCarro {

    public static void main(String[] args) {

        Carro fusca;
        fusca = new Carro();

        fusca.ano = 1990;
        fusca.fabricante = "Wolkswagen";
        fusca.modelo = "Fusca";

        fusca.desligar();
        fusca.ligar();
        fusca.desligar();
        //

        Carro fiat147 = new Carro();
        fiat147.ano = 1976;
        fiat147.fabricante = "FIAT";

        System.out.println(fiat147.ano);
        System.out.println(fiat147.fabricante);
        System.out.println(fiat147.modelo);

        fiat147.alteraVelocidade(10);
        System.out.println("FIAT 147. Vec Atual: " + fiat147.velocidade + " Marcha Atual: " + fiat147.marcha);

        fiat147.alteraVelocidade(10);
        System.out.println("FIAT 147. Vec Atual: " + fiat147.velocidade + " Marcha Atual: " + fiat147.marcha);

        fiat147.alteraVelocidade(10);
        System.out.println("FIAT 147. Vec Atual: " + fiat147.velocidade + " Marcha Atual: " + fiat147.marcha);

        fiat147.alteraVelocidade(10);
        System.out.println("FIAT 147. Vec Atual: " + fiat147.velocidade + " Marcha Atual: " + fiat147.marcha);

        fiat147.alteraVelocidade(10);
        System.out.println("FIAT 147. Vec Atual: " + fiat147.velocidade + " Marcha Atual: " + fiat147.marcha);

        fiat147.alteraVelocidade(10);
        System.out.println("FIAT 147. Vec Atual: " + fiat147.velocidade + " Marcha Atual: " + fiat147.marcha);

        fiat147.alteraVelocidade(10);
        System.out.println("FIAT 147. Vec Atual: " + fiat147.velocidade + " Marcha Atual: " + fiat147.marcha);

        fiat147.alteraVelocidade(10);
        System.out.println("FIAT 147. Vec Atual: " + fiat147.velocidade + " Marcha Atual: " + fiat147.marcha);

        fiat147.alteraVelocidade(10);
        System.out.println("FIAT 147. Vec Atual: " + fiat147.velocidade + " Marcha Atual: " + fiat147.marcha);

        fiat147.alteraVelocidade(10);
        System.out.println("FIAT 147. Vec Atual: " + fiat147.velocidade + " Marcha Atual: " + fiat147.marcha);

        //varíável: marcha e velocidade;
        //alteraVelocidade(velocidade)
        //se a velocidade maior que 100 vc troca  a marcha do carro
        //mostra marcha atual
    }

}
