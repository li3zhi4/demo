import java.util.Map;

public class Demo$001 {

    public static void main(String[] args) {
        System.out.println(longestMountain(new int[]{2,1,4,7,3,2,5}));
    }
    // [2,1,4,7,3,2,5]
    enum Position{
        INVALID,DOWN,UP;
    }
    public static int longestMountain(int[] a){
        int max = 0;int current = 0;int len = a.length;
        Position status = Position.INVALID;
        for (int i=1;i<len;i++){
            if(a[i-1]<a[i]){ // 当前上
                if (status == Position.UP) {
                    current++;
                } else {
                    status = Position.UP;
                    max = Math.max(max, current);
                    current = 2;
                }
            }else if(a[i-1]>a[i]){ // 当前下
                switch (status){
                    case DOWN:
                        current++;
                    case UP:
                        status = Position.DOWN;
                        break;
                    default:
                        status = Position.UP;
                        max =   Math.max(max,current);
                        current = 2;
                }
            }else {
                if (status == Position.DOWN) {
                    max = Math.max(max, current);
                }
                status = Position.INVALID;
            }
        }
        if (status == Position.DOWN && max < current){
            max = current;
        }
        return max;
    }
}
