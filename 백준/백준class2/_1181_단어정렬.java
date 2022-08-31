package class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _1181_단어정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//숫자를 입력받는다
		int num = sc.nextInt();
		
		//문자열을 입력받아 저장할 리스트를 만들어준다.
		List<String> list = new ArrayList<String>();
		

		//0부터 num까지 돌면서 문자열을 입력받고 리스트에 넣어준다.
		for(int i = 0; i < num; i++) {
			list.add(sc.next());
		}
		
		//알파벳순으로 정렬한다.
		Collections.sort(list);
		
		//문자열의 최대길이가 50이므로 1부터 50까지 돌면서 
		for(int i = 1; i<=50;i++) {
			//j번째 문자열의 길이가 i와 같으면
			for(int j = 0; j < list.size();) {
				if(list.get(j).length() == i) {
					//출력한다
					System.out.println(list.get(j));
					//그리고 list에서 삭제한다.
					list.removeAll(Arrays.asList(list.get(j)));
				}
				else
					j++;
			}
			//리스트가 비어지면 반복문을 멈춘다.
			if(list.isEmpty()) break;
		}
		
	}
}
