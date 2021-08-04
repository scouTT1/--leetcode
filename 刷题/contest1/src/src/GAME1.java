import java.util.Scanner;

public class GAME1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String str=input.next();
        System.out.println(str);
        Solution s = new Solution();
        s.checkZeroOnes(str);
    }
}

