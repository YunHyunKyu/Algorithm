package Sort;


import java.util.*;
import java.util.stream.Collectors;


class Human {
	private String name;
	private Integer age;
	
	public Human(String _name, Integer _age) {
		name = _name;
		age = _age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAges() {
		return age;
	}
}

public class API정렬 {
	
	public static List<Human> getUsers() {
		Human user = new Human("andrew", 32);
		Human user1 = new Human("betty", 24);
		Human user2 = new Human("robert", 40);
		Human user3 = new Human("andy", 24);
		return Arrays.asList(user, user1, user2, user3);
	}

	public static void main(String[] args) {
//		int[] ints = {5, 4, 2, 1, 3};
//		
//		//Arrays.sort(ints);
//		Arrays.sort(ints, 0, 3); // 0~2까지 정렬 수행
//		
//		for(int i = 0; i < ints.length; ++i) {
//			System.out.println(ints[i]);
//		}
//		
//		List<String> list = Arrays.asList("be", "an", "ro");
////		Collections.sort(list);
//		
//		for(int i = 0; i < list.size(); ++i) {
//			System.out.println(list.get(i));
//		}
//		
//		List<Integer> intList = Arrays.stream(ints).boxed().collect(Collectors.toList());
//		Collections.sort(intList);
//
//		for(int i = 0; i < intList.size(); ++i) {
//			System.out.println(intList.get(i));
//		}
//		
//		List<String> result = list.stream().sorted(String::compareTo).collect(Collectors.toList());
//		for(int i = 0; i < result.size(); ++i) {
//			System.out.println(result.get(i));
//		}
		
		List<Human> users = getUsers();
		
		List<Human> result = users
				.stream()
				//.sorted(Comparator.comparing(Human::getAges)) // 나이 순
				.sorted(Comparator.comparing(Human::getAges).thenComparing(Human::getName)) // 나이 순, 같은 나이일 때 이름 순
				.collect(Collectors.toList());
		
		for (Iterator iterator = result.iterator(); iterator.hasNext();) {
			Human human = (Human) iterator.next();
			System.out.println(human.getName() + " " + human.getAges());
		}
	}
}


