package com.kh.ch14_collection;

import java.util.HashMap;
import java.util.Set;

public class MapRun {
	/*
	 * Map<K,V> : key-value 형식을 데이터를 관리하는 콜렉션
	 * => List,Set과는 달리 Collection을 구현한 클래스는 아님!
	 * 		(메소드가 일부 다름)
	 */
	public static void main(String []args) {
		HashMap<String, Snack> hMap = new HashMap<>();
		
		hMap.put("바나나킥", new Snack("바나나맛", 1024));
		hMap.put("도리토스", new Snack("바베큐맛", 2048));
		hMap.put("프링글스", new Snack("어니언앤사워", 4096));
		
		hMap.put("도리토스2", new Snack("크림맛", 1234));
		//키값이 같은 경우 데이터(value)가 덮어 씌워짐!
		
		
		System.out.println(hMap);
		//=> 저장되는 순서가 유지되지 않음
		//=> 키값이 다르고 데이터 값이 동일해도 추가가 됨!
		
		//데이터 조회 : get(Object key)
		System.out.println(hMap.get("바나나킥"));
		
		//replace(K key, V newValue)
		//키값에 해당하는 데이터를 찾아서 다시 전달한 데이터로 변경해주는 메소드
		hMap.replace("도리토스2", new Snack("바바큐맛",512));
		
		//키 목록 조회 : KeySet() : set<K>
		Set<String> keyList = hMap.keySet();
		System.out.println(keyList);
		for(String key : keyList) {
			System.out.println(key + " : " + hMap.get(key));
		}
		
		
	}

}
class Snack{
	private String flavor;
	private int calory;
	
	public Snack(String flavor, int calory) {
		this.flavor = flavor;
		this.calory = calory;
		
	
	}

	@Override
	public String toString() {
		return " 맛 = " + flavor + ", 칼로리 = " + calory;
	}
}