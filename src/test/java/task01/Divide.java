package task01;

public class Divide {
   public static int divide(int num1, int num2){
      int answer = 0;

      while(num1>=num2){
         num1-=num2;
         answer++;
      }
      return answer;
   }
}
