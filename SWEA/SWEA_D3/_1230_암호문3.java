package D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class _1230_암호문3 {
	   public static void main(String args[]) throws Exception
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;
	        StringBuilder sb = new StringBuilder();

	        for(int tc = 1; tc <= 10; tc++)
	        {
	            st = new StringTokenizer(br.readLine());
	            int N = Integer.parseInt(st.nextToken());
	            st = new StringTokenizer(br.readLine());

	            List<Integer> list = new LinkedList<>();
	            for (int i = 0; i < N; i++){
	                list.add(Integer.parseInt(st.nextToken()));
	            }

	            st = new StringTokenizer(br.readLine());
	            int M = Integer.parseInt(st.nextToken());
	            st = new StringTokenizer(br.readLine());
	            for (int i = 0; i < M; i++){
	                String cmd = st.nextToken();
	                switch(cmd) {
	                case "I":
	                	insert(list, st);
	                	break;
	                case "D":
	                	delete(list, st);
	                	break;
	                case "A":
	                	add(list,st);
	                	break;
	                }
	            }
	            sb.append("#").append(tc).append(" ");
	            for (int i = 0; i < 10; i++){
	                sb.append(list.get(i)).append(" ");
	            }
	            sb.append("\n");
	        }
	        System.out.println(sb);
	    }
	   
	   //삽입
	    public static void insert(List<Integer> list, StringTokenizer st){
	        int x = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());
	        for (int i = 0; i < y; i++){
	            list.add(x + i, Integer.parseInt(st.nextToken()));
	        }
	    }
	    //삭제
	    public static void delete(List<Integer> list, StringTokenizer st){
	        int x = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());
	        for (int i = 0; i < y; i++){
	            list.remove(x);
	        }
	    }
	    //수정
	    public static void add(List<Integer> list, StringTokenizer st){
	        int y = Integer.parseInt(st.nextToken());
	        for (int i = 0; i < y; i++){
	            list.add(Integer.parseInt(st.nextToken()));
	        }
	    }
}
