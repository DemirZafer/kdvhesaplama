import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float kdv=0.18f;
        float para;
        Scanner akis = new Scanner(System.in);
        System.out.println("KDV hariç fiyat : ");
        para = akis.nextFloat();
        kdv = para >0&& para < 1000 ? 0.18f : 0.08f;
        float kdvh = (para * kdv) + para;
        System.out.println(kdvh);

        }
    }
