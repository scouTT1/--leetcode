import java.util.Scanner;

public class GAME3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String str=input.next();
        Solution s =new Solution();
        boolean a=s.canReach(str,2,3);
        System.out.println(a?true:false);

    }
}
