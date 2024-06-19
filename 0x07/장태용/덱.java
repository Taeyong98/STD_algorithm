package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
//덱
public class boj10866 {
    public static void main(String[] args) throws IOException {
        Deque<String> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String[] a = br.readLine().split(" ");
            switch (a[0]){
                case "push_front":
                    deque.addFirst(a[1]);
                    break;
                case "push_back":
                    deque.addLast(a[1]);
                    break;
                case "pop_front":
                    if(deque.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(deque.pollFirst());
                    }
                    break;
                case "pop_back":
                    if(deque.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(deque.pollLast());
                    }
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    if(deque.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if(deque.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(deque.peekFirst());
                    }
                    break;
                case "back":
                    if(deque.isEmpty()){
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(deque.peekLast());
                    }
                    break;
            }
        }
        br.close();
    }
}
