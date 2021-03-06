package BOJ.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  15829.Hashing
 *
 *  일정 문자열길이를 넘어버리면 타입 범위를 아득히 넘어버린다
 *
 *
 */
public class BOJ15829 {
    static final int r=31;
    static final int M=1234567891;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L=Integer.parseInt(br.readLine());
        String s=br.readLine();
        long answer=0;
        for(int i=0;i<L;i++){
            answer+=(s.charAt(i)-'a'+1)*pow(r,i);
        }
        System.out.println(answer%M);
    }
    static long pow(int a,int b){
        return b==0?1:a*pow(a,b-1)%M;
    }
}