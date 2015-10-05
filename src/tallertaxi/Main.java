/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallertaxi;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        static Scanner in = new Scanner(System.ini);
        int grupo = in.nextInt();
        */
        Scanner in = new Scanner(System.in);
        int cantGrupos = in.nextInt();
        
        //String[] input = FileManager.readLines("C:/Users/Marco/Documents/NetBeansProjects/TallerTaxi/Input.txt");
        int amigos, grupo1 = 0, grupo2 = 0, grupo3 = 0, grupo4 = 0, taxis = 0;
        //String[]grupos = input[1].split(" ");
        for (int i = 0; i < cantGrupos; i++) {
            amigos = in.nextInt();
            //amigos = Integer.parseInt(grupos[i]);
            switch (amigos) {
                case 1:
                    grupo1++;
                    break;
                case 2:
                    grupo2++;
                    break;
                case 3:
                    grupo3++;
                    break;
                case 4:
                    grupo4++;
                    break;
            }
        }

        taxis += grupo4;
        taxis += grupo3;
        grupo1 -= grupo3;
        taxis += (int) grupo2 / 2;
        if (grupo2 > 0 && grupo2 % 2 != 0) {
            taxis++;
            grupo1 -= 2;
        }
        if (grupo1 > 0) {
            taxis += (int) grupo1 / 4;
            if (grupo1 % 4 != 0) {
                taxis++;
            }
        }
        System.out.println(taxis);

    }

}
