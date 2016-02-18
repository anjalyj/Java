import cal.*;


class Calculator{
  public static void main(String ags[]){
    Calc c = new Calc();
    Calc sum;
    sum=c.add(10).add(15);
    System.out.println(c.result);
  }
}
