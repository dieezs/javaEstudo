package aulasDevDojo.modificadorEstatico;

public class Cliente {

    private static int[] parcelas;

    static {
        parcelas = new int[100];
        System.out.println("dentro do bloco de inicialização");
        for(int i = 1 ; i<=100; i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente() {

    }

    public static int[] getParcelas() {
        return parcelas;
    }


}
