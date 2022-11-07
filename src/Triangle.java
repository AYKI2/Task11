import java.util.Scanner;
public class Triangle {
    Scanner input = new Scanner(System.in);
    private String name;
    private int age;
    public void setName(String userName) {
        name = userName;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int userAge) {
            age = userAge;
    }

    public int getNumber() {
        return age;
    }

    public void method(){
        System.out.println("Меня зовут "+name+". Мне "+age+" лет!");
    }
}

