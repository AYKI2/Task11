import java.util.Scanner;

public class Studentter {
    public Scanner input = new Scanner(System.in);
private String fullName;
private String phoneNumber;
private String address;
private int bankAccount;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    int liveIn(Apartment[] apartments,Studentter[] studentters) {
        int counterStudent = 0;
        for (int j = 0; j < apartments.length; j++) {
            for (int i = 0; i < studentters.length; i++) {
                if (apartments[0].getAddress().equals(studentters[i].getAddress())) {
                    counterStudent++;
                }
            }
            break;
        }
        int counter = 0;
        int rent = getBankAccount();
        int index = 0;
        for (int i = 0; i < apartments.length; i++) {
            for (int j = 0; j < studentters.length; j++) {
                if (apartments[index].getAddress().equals(getAddress())) {
                    if(counterStudent > j) {
                        if (rent > 0) {
                            rent = getBankAccount() - apartments[index].payPerMonth(studentters);
                            counter++;
                        }
                    }else {
                        break;
                    }
                }
            }
            index++;
        }
        return counter;
    }

    void changeInfo(Studentter[] studentters){
        while(true){
        System.out.print("Введите имя студента у которого хотите изменить данные: ");
        String name = input.next();
            for (Studentter studentter : studentters) {
                if (name.equals(studentter.getFullName())) {
                    System.out.println();
                    System.out.println("Имя: ");
                    studentter.setFullName(input.next());
                    System.out.println("Номер телефона: ");
                    studentter.setPhoneNumber(input.next());
                    System.out.println("Адрес: ");
                    studentter.setAddress(input.next());
                    System.out.println("Счет: ");
                    studentter.setBankAccount(input.nextInt());

                    System.out.println("\n-----Измененные данные-----");
                    System.out.println("Имя: "+studentter.getFullName());
                    System.out.println("Номер телефона: "+studentter.getPhoneNumber());
                    System.out.println("Адрес: "+studentter.getAddress());
                    System.out.println("Счет: "+studentter.getBankAccount());
                }
            }
        }
    }
}