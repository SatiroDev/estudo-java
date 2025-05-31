// minha parte
// package conceitosbasicos.estruturarepeticoes;
// import java.util.Scanner;
// public class ValidadorSenha {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String senha = "java123";
//         String senha_user = "a";
//         System.out.println("Digite sua senha: ");
//         while(senha_user != senha) {
//             String senha_use = input.nextLine();
//             if (senha_use.equals(senha)) {
//                 System.out.println("Senha correta!");
//                 break;
//             }
//             else {
//                 System.out.println("Senha incorreta, tente novamente!");
//             }
//         }
//         input.close();
//     }
// }


// ajuda do chat

package conceitosbasicos.estruturarepeticoes;
import java.util.Scanner;
public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String senha = "java123";
        String senha_user = "a";
        while(!senha_user.equals(senha)) {
            System.out.println("Digite sua senha:");
            senha_user = input.nextLine();
            if (senha_user.equals(senha)) {
                System.out.println("Senha correta!");
            }
            else {
                System.out.println("Senha incorreta, tente novamente!");
            }
        }
        input.close();
    }
}

