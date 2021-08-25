package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < 100000; i++) {
            if(n<=1+3*(i*i)-3*i){
                System.out.println(i);
                break;
            }
        }
    }
}
