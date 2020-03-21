public class Runner {
public static void main(String[] args) {
    Something s = new Something();

    Class classe1 = s.getClass();
    System.out.println(classe1.getName());
    System.out.println(classe1.getSuperclass());

    Something s1 = new Something();
    s1.setA(20);

    try {
      Something s2 = (Something) s1.clone();
      System.out.println(s2.toString() + "\n" + s1.toString());
    } catch (CloneNotSupportedException e) {
      //TODO: handle exception
      e.printStackTrace();
      System.out.println("HEHE");
    }
    }
}