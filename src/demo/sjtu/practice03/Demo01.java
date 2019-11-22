package demo.sjtu.practice03;
import java.io.*;


public class Demo01 {

    public static void main(String[] args) throws IOException {
        int count = 0;
        System.out.println("please type here");
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        char c = (char)(buff.read());

        while (c != '#') {
            count ++;
            c = (char)(buff.read());
        }
        System.out.println("count :" + count);
    }


}
