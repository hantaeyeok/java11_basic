package sec2;

import java.util.ArrayList;
import java.util.List;

//컬랙션 프레임워크(Collection Framework) : 자바에서 기본적으로 제공하는 여러 데이터를 저장하고, 
//관리하기 위한 미리 준비해놓은 자료 구조 틀
public class CollectionExam1 {
//Map, Set, List = > 기본은 모두 제네릭 형태이다.
	public static void main(String[] args) {
//List 인터페이스 : ArrayList, Vector, LinkedList
//Set  인터페이스 : HashSet, TreeSet
//Map  인터페이스 : HashMap, HshTable, TreeMap, Properties
//Stack, Queue, Deque 등 도 자료구조에 해당하는 컬랙션 프레임워크의 일종이다.		
//자료구조인 컬랙션 프레임워크에서 자주 사용하는 메소드
//add : 해당 컬랙션 프레임워크의 인스턴스 추가
//clear : 해당 컬랙션 프레임워크의 모든 인스턴스 제거
//remove : 해당 컬랙션 프레임워크의 특정 인스턴스 제거
//자료구조 자료의 논리적인 저장 원리에 따른 구조
//1. 단순구조(primitive) : 정수, 실수, 문자, 문자열, 논리형
//2. 선형구조(Sequence)  : 배열(Array), 리스트(List), 스택(Stack), 큐(Queue), 덱(deque)		//선형구조는 순서가잇는 것 , 참조형
//3. 비선형구조(Non-Sequence) : 맵(Map), 트리(Tree), 그래프(Graph), 셋(Set)							//참조형
//
		
//		ArrayList<String> lst = new ArrayList<String>();	Array로만 사용가능하여 인터페이스로 선언해야함
		List<String> lst = new ArrayList<String>();
		lst.add("김동연");
		lst.add("강범준");
		lst.add("장인범");
		lst.add("이필규");
		for(String s : lst) {
			System.out.println(s);
		}
		//List<Student>, Map<Board>, Set<Data> => <> 인자가 규정되므로 제네릭의 일종이다.
		
	}

}
