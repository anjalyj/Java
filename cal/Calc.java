package cal;

public class Calc{
    public int result;

  public Calc(){
    this.result = 0;
  }

  public Calc add(int num){
    this.result+=num;
    return this;
  }

  public Calc sub(int num){
    this.result-=num;
    return this;
  }
}
