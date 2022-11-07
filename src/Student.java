public class Student {
    private int id;
    private String fullName;
    private byte age;
    private String group;

    public void setId(int id){

        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return fullName;
    }

    public void setAge(byte age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setGroup(String group){
        this.group = group;
    }
    public String getGroup(){
        return group;
    }

    public void printStudent(Student[] students,int scannerId) {
            for (int i = 0; i < students.length; i++) {
                if (scannerId == students[i].id) {
                    System.out.println(students[i].id);
                    System.out.println(students[i].fullName);
                    System.out.println(students[i].age);
                    System.out.println(students[i].group);
                    break;
                }
            }

    }
}
