package club.shengsheng.code;

/**
 * @author gongxuanzhangmelt@gmail.com
 **/
public class Demo {
    public static void main(String[] args) {
        System.out.println(2);
        System.out.println(max(2, 1));
        System.out.println(add(0,4));
        System.out.println(add2(0,4));
        System.out.println(add3(0,4));
    }
    public static int add(int a, int b) {
        if (a==b){
            return a;
        }
        return a+add(a+1,b);
    }

    public static int add2(int a, int b) {
        if (a==b){
            return a;
        }
        int c = add2(a+1,b);
        return a+c;
    }

    public static int add3(int a, int b) {
        if (a==b){
            return a;
        }
        add3(a+1,b);
        return a+a;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
