import java.util.Scanner;

public class GAME2 {
    public static void main(String[] args){

        //Scanner input = new Scanner(System.in);
        //String str=input.next();
        //System.out.println(str);
        Solution s = new Solution();
        int way[]={1,3,2};
        double houer=6;
        int a =s.minSpeedOnTime(way,houer);
        System.out.println(a);
        //s.checkZeroOnes(str);
    }
}

