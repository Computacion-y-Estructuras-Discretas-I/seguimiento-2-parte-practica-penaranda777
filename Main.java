import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int na = sc.nextInt(), nb = sc.nextInt(), k = sc.nextInt();

        int[] servidorA = new int[na];
        for (int i = 0; i < na; i++) servidorA[i] = sc.nextInt();

        int[] servidorB = new int[nb];
        for (int i = 0; i < nb; i++) servidorB[i] = sc.nextInt();

        int[] baneados = new int[k];
        for (int i = 0; i < k; i++) baneados[i] = sc.nextInt();

        sc.close();

        TreeSet<Integer> activos = jugadoresActivos(servidorA, servidorB, baneados);

        System.out.println(activos.size());
        StringBuilder sb = new StringBuilder();
        for (int id : activos) sb.append(id).append(' ');
        System.out.println(sb.toString().trim());
    }


    public static TreeSet<Integer> jugadoresActivos(int[] servidorA,
                                                     int[] servidorB,
                                                     int[] baneados) {
        TreeSet<Integer> A = new TreeSet<>();
        for ( int A1 : servidorA){
            A.add(Integer.valueOf(A1));
        }

        TreeSet<Integer> B = new TreeSet<>();
        for (int A2 : servidorB){
            B.add(Integer.valueOf(A2));
        }

        A.addAll(B);

        TreeSet<Integer> Ban = new TreeSet<>();
        for (int Bn: baneados){
            Ban.add(Integer.valueOf(Bn));
        }

        A.removeAll(Ban);

        return A;
    }
}