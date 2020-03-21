public class Something implements Cloneable {
  //instance variables
  private int a;

  //getter and setter 
  public int getA() {
    return a;
  }

  public void setA(int newA) {
    this.a = newA;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}