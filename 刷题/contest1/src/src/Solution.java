import java.util.ArrayList;
import java.util.Vector;

public class Solution{
    public boolean checkZeroOnes(String s){
        int temp=s.charAt(0)=='1'?1:-1;
        int score1=0;
        int score2=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                if(temp>score1)score1=temp;
                if(temp<score2)score2=temp;
                temp=0;
            }
            if(s.charAt(i)=='1')temp++;
            if(s.charAt(i)=='0')temp--;
        }
        if(temp>score1)score1=temp;
        if(temp<score2)score2=temp;
        if(score1+score2>0)return true;
        return false;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        if(Math.ceil(hour)<dist.length){
            return -1;
        }
        int maxlength=0;
        int way=0;
        for(int i=0;i<dist.length;i++) {
            if (dist[i] > maxlength) {
                maxlength = dist[i];
            }
            way += dist[i];
        }
        double a=dist[dist.length-1]/(hour-(double)(dist.length-1));
        a = (int)a+1;
        int maxv= (int) Math.max(maxlength,a)+1;
        double time;
        int minv=(int)(way/hour);
        int temp=0;
        int score=0;
        while(minv<=maxv){
            time=0.0;
            temp=(minv+maxv+1)/2;
            for(int j=0;j<dist.length-1;j++){
                time+=Math.ceil((double)dist[j]/(double)temp);
            }

            time+=(double)dist[dist.length-1]/(double)temp;
            if(time>hour){
                minv=temp+1;
            }
            if(time<hour){
                score=temp;
                maxv=temp-1;
            }
            if(time == hour){
                return temp;
            }
        }
        return score;

    }
    public boolean canReach(String s, int minJump, int maxJump) {
        int length=s.length();
        Vector<Boolean> dp= new Vector<Boolean>();
        for(int i=0;i<length;i++){
            dp.add(false);
        }
        dp.set(0,true);
        int temp=1;
        for(int i=minJump;i<length;i++){
            if(s.charAt(i)=='0'&&temp>0){
                dp.set(i,true);
            }
            if(i>=maxJump&&dp.get(i-maxJump)){
                temp--;

            }
            if(dp.get(i-minJump+1)){
                temp++;
            }
        }
        return dp.get(length-1);
    }
    public int stoneGameVIII(int[] stoneV){
        int length=stoneV.length;
        int[] pre=new int[length];
        pre[0]=stoneV[0];
        for(int i =1;i<length;i++){
            pre[i]=pre[i-1]+stoneV[i];
        }
        int[] f=new int[length];
        f[length-1]=pre[length-1];
        for(int i=length-2;i>0;i--){
            f[i]=Math.max(f[i+1],pre[i]-f[i+1]);
        }
        return f[1];
    }

}