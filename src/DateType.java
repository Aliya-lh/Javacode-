import sun.awt.geom.AreaOp;

import java.sql.SQLOutput;

public class DateType {
    public static void main1(String[] args) {
        //short的表示范围
        System.out.println("short的数据范围：");
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println("================");
        //byte的表示范围
        System.out.println("Byte的数据范围：");
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }

    public static void main2(String[] args) {
        //long的表示范围
        System.out.println("long的数据范围：");
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        long a1 = 12345678901234L;
        long a2 = 12345678901234l;
        long a3 = 12_345_678_901_234L;
        long b = 123456789;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(b);
    }

    public static void main3(String[] args) {
        //int 的表示范围
        System.out.println("int的数据范围：");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

//    int a=12345678901234;
//    System.out.println(a);
    }

    public static void main4(String[] args) {
        int a = 10;
        int b;
        b = 20;
        System.out.println(a);
        System.out.println(b);
        //int c;
        //System.out.println(c);
    }

    public static void main5(String[] args) {
        byte a = 10;//要注意byte的最大值为127，最小值为-128
        short b = 20;
        int c = 30;
        long d = 40;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        c = 200;
        System.out.println(c);

        float f = 12.34f;
        double dd = 3.1415926;
        System.out.println(f);
        System.out.println(dd);

        char ch = 'A';
        System.out.println(ch);

        boolean b2 = true;
        System.out.println(b2);

        b2 = false;
        System.out.println(b2);
    }

    public static void main6(String[] args) {
        System.out.println("Hello World!!!");//字符串变量
        System.out.println(100);//100  整型变量
        System.out.println(12.34);//小数-浮点数据常量
        System.out.println('A');//字符-字符类型的常量
        System.out.println(true);//布尔类型的常量
        System.out.println(false);
        //System.out.println(null);
    }
    public static void main(String[] args){
        String s1 ="hello";
        String s2="1234";//数字类型字符串
        System.out.println(s1);
        System.out.println(s2);

        String s3="world!!!";
        s1=s1+s3;//s1和s3拼接起来，然后将拼接的结果交给s1
        System.out.println(s1);

        int a=1234;//需求：将a转换成字符串类型
        String s4=""+a;//""空字符串
        System.out.println(s4);

        String s5=String.valueOf(a);
        System.out.println(s5);

        //需求：将数字类型字符串转换为整型数字
        int b=Integer.parseInt(s2);
        System.out.println(b);

    }


}










