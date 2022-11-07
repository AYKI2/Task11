import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        Student student1 = new Student();
//        student1.setId(1);
//        student1.setFullName("Исхак");
//        student1.setAge((byte) 20);
//        student1.setGroup("ПКС-18-1");
//
//        Student student2 = new Student();
//        student2.setId(2);
//        student2.setFullName("Мухаммед");
//        student2.setAge((byte) 19);
//        student2.setGroup("ТМП-19-2");
//
//        Student student3 = new Student();
//        student3.setId(3);
//        student3.setFullName("Азамат");
//        student3.setAge((byte) 19);
//        student3.setGroup("ПОВ-2-3");
//
//        Student[] students = {student1,student2,student3};
//        while (true){
//            student1.printStudent(students, input.nextInt());
//        }

        Apartment apartment1 = new Apartment();
        apartment1.setTitle("Ихлас");
        apartment1.setPrice(35000);
        apartment1.setAddress("Ул. Бакаева");

        Apartment apartment2 = new Apartment();
        apartment2.setTitle("Эмарк");
        apartment2.setPrice(40000);
        apartment2.setAddress("Ул. Айтматова");

        Studentter student1 = new Studentter();
        student1.setFullName("Исхак");
        student1.setPhoneNumber("+996507434242");
        student1.setAddress("Ул. Бакаева");
        student1.setBankAccount(35000);

        Studentter student2 = new Studentter();
        student2.setFullName("Идирис");
        student2.setPhoneNumber("+10987654321");
        student2.setAddress("Ул. Бакаева");
        student2.setBankAccount(35000);

        Studentter student3 = new Studentter();
        student3.setFullName("Мухаммед");
        student3.setPhoneNumber("+10987654321");
        student3.setAddress("Ул. Айтматова");
        student3.setBankAccount(200000);

        Studentter student4 = new Studentter();
        student4.setFullName("Азамат");
        student4.setPhoneNumber("+12345678910");
        student4.setAddress("Ул. Айтматова");
        student4.setBankAccount(200000);



        Apartment[] apartments = {apartment1,apartment2};
        Studentter[] studentters = {student1,student2,student3,student4};

        System.out.print("Введите название квартиры: ");
        String setTitle = input.next();
        for (Apartment apartment:apartments){
            for (Studentter studentter:studentters){
                if (setTitle.equals(apartment.getTitle())) {
                    if (apartment.getAddress().equals(studentter.getAddress())){
                        System.out.println("Имя: "+studentter.getFullName());
                        System.out.println("Номер телефона: "+studentter.getPhoneNumber());
                        System.out.println("Адрес: "+studentter.getAddress());
                        System.out.println("Банковский счет: "+studentter.getBankAccount());
                        System.out.println();
                    }
                }
            }
        }
        System.out.println("Квартплата каждого студента : "+apartment1.payPerMonth(studentters));
        student1.liveIn(apartments,studentters);
        student1.changeInfo(studentters);

    }
}