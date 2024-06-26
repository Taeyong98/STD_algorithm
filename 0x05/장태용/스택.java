package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj10828 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch(command){
                case "push" : stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" : if(!stack.isEmpty()) System.out.println(stack.pop());
                    else System.out.println(-1);
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" : if(!stack.isEmpty()) System.out.println(0);
                    else System.out.println(1);
                    break;
                case "top" : if(!stack.isEmpty()) System.out.println(stack.peek());
                    else System.out.println(-1);
                    break;
            }
        }
    }
}
