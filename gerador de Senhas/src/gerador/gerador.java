package gerador;

import java.util.Random;

public class gerador { 




    public void criarSenha(){
        System.out.println("!---------------------------------------------------------------------------------!");
        System.out.println("!---------------------------------------------------------------------------------!");
        System.out.println("!---------------------------------------------------------------------------------!");
        System.out.println("!-----------------------------------Senha Gerada----------------------------------!");
        System.out.print("!------------------------------------");

        for (int i = 0; i <=8 ; i++) {
            Random aleatorio = new Random();
            int indice = aleatorio.nextInt(76);
            String caracter = "abcdefghijklmnopqrstuvwxyzabcdABCDEFGHIJKLMNOPQRSTUVWXYZABCD1234567890!@#$%&";
            char senha = caracter.charAt(indice);
            System.out.print(senha);

        }
        System.out.println("!-----------------------------------!");
        System.out.println("!---------------------------------------------------------------------------------!");
        System.out.println("!---------------------------------------------------------------------------------!");
        System.out.println("!---------------------------------------------------------------------------------!");


    }
    
}
