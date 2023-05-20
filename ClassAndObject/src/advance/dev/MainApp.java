package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] arg) {
		Student[] students = new Student[1];
		input(students);
		print(students);
	}
	
	public static void input(Student[] students) {
		Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
			System.out.println("Nhap thong tin sinh vien " + (i+1) );
			System.out.print("Nhap ten: ");
			String name = sc.nextLine();
			System.out.print("Nhap tuoi: ");
            int age = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap dia chi: ");
			String address = sc.nextLine();
			System.out.print("Nhap so: ");
			String phone= sc.nextLine();
			System.out.print("Nhap diem trung binh: ");
			double averScore = sc.nextDouble();
            students[i] = new Student(name, age, address, phone, averScore);
			}
    }

    public static void print(Student[] students) {
        System.out.println("Danh sach hoc sinh:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("Hoc sinh " + (i + 1) + ":");
            System.out.println("Ten: " + students[i].getName());
            System.out.println("Tuoi: " + students[i].getAge());
            System.out.println("Dia chi: " + students[i].getAddress());
            System.out.println("So dt: " + students[i].getPhone());
            System.out.println("Diem trung binh: " + students[i].getAverScore());
        }
    }
}