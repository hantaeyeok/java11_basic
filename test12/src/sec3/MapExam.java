package sec3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;


//map 


public class MapExam {
	//{}출력문에서 {}는 map이란걸 알수 있다.
	public static void main(String[] args) {			
		//Map은 List 처럼 Index가 존재하지 않는 것이 아니라 키가 존재한다.
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>();
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 = new Properties();
		
		map1.put("Kim", 90); 					//put == add 넣는 기능
		map1.put("Lee", 100); 				
		map1.put("Park", 80); 				
		map1.put("Kang", 100);
		map1.put("Kwon", 90); 				
		System.out.println(map1);
		System.out.println("Park : "+map1.get("park"));	//개별 요소 접근시 index가 아니라 키로 해야함
		System.out.println();
		
		//map 순회 1 : Iterator(분리자) 에 의한 접근 : 전통적인 방법
		//Keys = {kim,lee,park,kang,kwon};
		System.out.println("Iterator에 의한 순회");
		Iterator<String> keys = map1.keySet().iterator();		//맵의 키모음(keySEt)이 하나의 요소로 분리됨(iterator)
		while(keys.hasNext()) {			//키는 while/
			String key = keys.next();
			System.out.println(key + "="+map1.get(key));	//map1.get("kim")
		}
		System.out.println();
		//map 순회 2 : entrySet (키와 값의 하나의 쌍 => entry) 에 의한 접근
		System.out.println("entrySet에 의한 순회");
		for(Map.Entry<String, Integer> entry : map1.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key +"key:" +value);
		}
		System.out.println();
		
		//map 순회 3 : keySet 에 의한 접근
		System.out.println("keySet에 의한 순회");
		for(String key : map1.keySet()) {
			System.out.println(key + ":"+map1.get(key));
		}
		System.out.println();
		
		
		if(map1.containsKey("kang")) {
			System.out.println("Kang : "+map1.get("kang"));
		} else {
			System.out.println("키가 kang인 요소는 존재하지 않습니다.");
		}
		
		if(map1.containsValue(100)) {
			System.out.println("100 만점자가 존재합니다.");
		} else {
			System.out.println("100 만점자가 없습니다.");
		}
	
		//Hashtable 
		//키는 중복될 수 없음
		map2.put("김", "1코스");
		map2.put("이", "2코스");
		map2.put("박", "3코스");
		map2.put("김", "2코스");
		map2.put("이", "3코스");
		map2.put("최", "1코스");
		System.out.println(map2);
		
		String[] arr = new String[10];
		map2.remove("김");
		System.out.println("**********편집후**********");
		System.out.println(map2);
		System.out.println("**********비우기 후**********");
		map2.clear();
		System.out.println(map2);
		
		//배열의 값을 TreeMap에 대입
		System.out.println("TreeMap");
		String[] names = {"김기태","김도연","김민식","김민아","김윤정","김필규","김예은","김민지","김성우"};
		for(int i = 0; i <= 9; i++) {
			map3.put(i, names[i]);
		}
		System.out.println("\n인원수 : "+map3.size());
		for(Integer i : map3.keySet()) {
			int key = i;
			String value = map3.get(i);
			System.out.println(key + " : "+ value);
		}
		System.out.println();
		
		//Properties 의 키(필드이름) 과 값은 모두 문자열로 취급된다.
		//Properties 속성 
		map4.setProperty("name", "김기태");
		map4.setProperty("age", "43");
		map4.setProperty("height", "173.1");
		map4.setProperty("kor", "100");
		map4.setProperty("eng", "70");
		map4.setProperty("mat", "100");
		System.out.println("이름 : "+map4.getProperty("name"));
		System.out.println("이름 : "+map4.getProperty("eng"));
		
		
		
	}

}
