package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Courses;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Set<Courses> cor = new HashSet<>();

		System.out.print("How many students for course A? ");
		int n = sc.nextInt();

		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			cor.add(new Courses(a));
		}

		System.out.print("How many students for course B? ");
		int n1 = sc.nextInt();

		for (int i=0; i<n1; i++) {
			int b = sc.nextInt();
			cor.add(new Courses(b));
		}

		System.out.print("How many students for course C? ");
		int n2 = sc.nextInt();

		for (int i=0; i<n2; i++) {
			int c = sc.nextInt();
			cor.add(new Courses(c));
		}
		
		System.out.println("Total students: " + cor.size());
		sc.close();
	}
}
