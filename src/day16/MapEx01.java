package day16;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		// Map != Collection
		// Map => HashMap<Key, Value> Key => 중복 X, Value => 중복 O
		// 같은 Key값을 추가하면 기존값에 덮어씌워짐
		HashMap<String, String> userList = new HashMap<String, String>();
		userList.put("id1", "pw1");
		
		userList.put("id2", "id2");
		userList.put("id3", "id2");
		userList.put("id3", "abc");
		
		System.out.println(userList);
		
		//방법1. keySet을 이용
		//keySet()은 map에 있는 key들을 하나의 set에 담아 반환하는 메소드
		Set<String> keySet = userList.keySet();
		for(String  tmp : keySet) {
			System.out.println(tmp + " : "+userList.get(tmp));
		}
		
		//방법2. EntrySet을 이용
		Set<Entry<String, String>> entrySet = userList.entrySet();
		for(Entry<String, String> tmp : entrySet) {
			System.out.println(tmp.getKey() + " : " + tmp.getValue());
		}
				

	}

}
