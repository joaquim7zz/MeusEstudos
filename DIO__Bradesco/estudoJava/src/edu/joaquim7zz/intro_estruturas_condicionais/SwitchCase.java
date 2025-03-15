package edu.joaquim7zz.intro_estruturas_condicionais;

public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "p";
        switch (sigla) {
            case "p":{
                System.out.println("Pequeno");
                break;
            }
            case "q":{
                System.out.println("Medio");
                break;
            }
            case "r":{
                System.out.println("Grande");
                break;
            }
            default:{
                System.out.println("Indefinido");
            }

        }
    }
}
