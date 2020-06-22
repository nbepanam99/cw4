package com.cw4.frameworks.collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

import com.cw4.model.Person;

public class ExampleJava5EtJava8 {

	public static void main(String[] args) {

		//oldSchoolMethode(); //programmation impérative. On programme l'algo.
		//modernWay();// fonctionneelle , on spécifie une opération ou un resutat, on donne des opérateur, 
					// on laisse l'api le soin de déterminer le résultat.-> parallélisme
		
		
		
		
		//generateRandomdStringOldMethod();
		generateRandomdStringNewMethod();

	}
 
	private static void generateRandomdStringNewMethod() {
		
		
		Random rand= new Random();
		long nextLong = rand.nextLong();
		Stream<String> generate = Stream.generate( () -> Long.toHexString(ThreadLocalRandom.current().nextLong() ));
		
		Stream<String> stream = generate.map(s->s.substring(0,10)).limit(10_000_000).sorted();
		System.out.println("-1-"+LocalDateTime.now());
		Object[] array = stream.toArray();
		System.out.println("-2-"+LocalDateTime.now());
		Stream<String> generate2 = Stream.generate( () -> Long.toHexString(ThreadLocalRandom.current().nextLong() ));
		Stream<String> streamParall = generate2.map(s->s.substring(0,10)).limit(10_000_000).sorted().parallel();
		System.out.println("-3-"+LocalDateTime.now());
		Object[] arrayParall = streamParall.toArray();
		System.out.println("-4-"+LocalDateTime.now());
		System.out.println("rand.nextLong()= "+nextLong);
		System.out.println("Long.toHexString(nextLong )= "+Long.toHexString(nextLong));
		
	}

	private static void generateRandomdStringOldMethod() {
		Random rand= new Random();
		String[] strings=new String[10_000_000];
		for (int i=0;i<strings.length;i++) {
			strings[i]=Long.toHexString(rand.nextLong());
		}
	}

	private static void modernWay() {
		
		List<Person> persons = new ArrayList<Person>(); // ON passe du code en argument et non des objets.j
		
		OptionalDouble average = persons.stream().mapToInt(Person::getAge).filter(age -> age>20).average();
		
		int sommeDesAges = persons.stream()
				.mapToInt(p->p.getAge())
				.filter(age -> age>20)
				.reduce(0,(a,b)->a+b);
	}

	private static void oldSchoolMethode() {
		calculMoyenneAge(null);

	}

	private static int calculMoyenneAge(List<Person> persons) {
		int somme = 0;
		int n = 0;
		
		for(Person p :persons) {
			n++;
			somme+=p.getAge();
		}
		
		return n>0?(somme/n):0;
		
		

	}

}
