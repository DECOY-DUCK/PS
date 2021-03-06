package BOJ.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            que.add(Integer.parseInt(br.readLine()));
        }
        int answer = 0;
        while (!que.isEmpty()){
            answer = Math.max(answer, que.size()*que.poll());
        }
        System.out.println(answer);
    }
}
