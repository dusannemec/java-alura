public class TestaMetodo {

    public static void main(String [] args) {
        Conta contaDoRodrigo = new Conta();
        contaDoRodrigo.saldo = 100;
        contaDoRodrigo.deposita(50);
        System.out.println(contaDoRodrigo.saldo);
        
        boolean conseguiuRetirar = contaDoRodrigo.saca(100);
        System.out.println(contaDoRodrigo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaCarol = new Conta();
        contaDaCarol.deposita(1000);
        System.out.println(contaDaCarol.saldo);

        boolean conseguiuTransferir = contaDaCarol.transfere(300, contaDoRodrigo);
        System.out.println(contaDoRodrigo.saldo);
        System.out.println(contaDaCarol.saldo);
        System.out.println(conseguiuTransferir);
    }
}