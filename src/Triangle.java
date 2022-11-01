public class Triangle {
    int a;
    int b;
    int c;

    public void area(){
        double p = a+b+c;
        double q = p/2;
        double s = Math.sqrt(q*(q-a)*(q-b)*(q-c));
        System.out.print("Площадь треугольника: "+s);
    }
}
