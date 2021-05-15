public class Practise {

    public static void main(String[] args) {


        int x = 2147483639;

        float y = 19e5f;

        char z = 02;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        int a=5;
        System.out.println(a++); //returns 5

        int b=6;
        System.out.println(++b);//returns 7


        String xx = "12345";
        System.out.println(xx.length());
        System.out.println(xx.charAt(1));

        String q="I am \"GOOD\" boy";
        System.out.println(q);

        String w="I am \n GOOD  boy";
        String ww="I am \r GOOD  boy";
        String www="I am \t GOOD  boy";
        String wwww="I am GOOD  boy \b";
        System.out.println(w);
        System.out.println(ww);
        System.out.println(www);
        System.out.println(wwww);


        System.out.println(10+20); //30
        System.out.println("10"+"20"); //1020
        System.out.println(10+"20"); //1020

        System.out.println(Math.abs(-100));
        System.out.println(Math.random());
        int p = 10;
        int pp = 9;
        System.out.println(p > pp);

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
               // break;  //breaks after 4
                continue; //doesnot prints only 4
            }
            System.out.println(i);
        }

        String[] cars = {"benz" , "Audi" , "Honda"};
        for(String c : cars){
            System.out.print(c); //c should be used inside this
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int[] xxx : myNumbers) {
            for(int yyy:xxx) {
                System.out.println(yyy);
            }
        }





    }
}
