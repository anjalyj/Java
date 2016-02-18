import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.Arrays;

public class ArrayTest{

  @Test
  public void single_dimensional_array(){
    int[] a={33,3,4,5};
    for(int i=0;i<a.length;i++)
    System.out.println(a[i]);
  }

  @Test
  public  void multi_Dimensional_array(){
    int a=2;
    int[][] arr=new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        arr[i][j]=a;
        a++;
      }
    }
    // int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<3;i++){
     for(int j=0;j<3;j++){
       System.out.print(arr[i][j]+" ");
     }
     System.out.println();
    }
  }
  @Test
  public void equality_test(){
    int[] a=new int[10];
    int[] b=new int[10];
    Arrays.fill(a,5);
    Arrays.fill(b,5);
    assertTrue(Arrays.equals(a,b));
  }
}
