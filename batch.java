class Student{
  private int age;
  private String name;
  public Student(String name,int age){
    this.age = age;
    this.name= name;
  }
  public Student (String name){
    this(name,22);
  }
  public static Student createOldest(String name){
    return new Student(name,50);
  }
  public void print(){
    System.out.println("Student's name is "+this.name+" and is of age "+this.age);
  }
}

class batch{
  public static void main(String args[]){
      Student anjaly = new Student("anjaly");
      Student anusree = new Student("anusree",25);
      Student shibi = Student.createOldest("shibi");
      anjaly.print();
      shibi.print();
      anusree.print();
  }
}
