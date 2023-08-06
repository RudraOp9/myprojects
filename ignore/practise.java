// this java file contains code to generate Fibonacci Sequence List. Replace line 9 input for results of your choice.
public class practise {

    int num(int a, int b) {

        int x = 0;
        int y = 0;
        int z = 0;
       while (a<20 && b<20) {
           x=a;
           y=b;
           z= x+y;
          // int cum = num(x, y);
           System.out.print(z + " ");
           a=b;
           b=z;


       }
        return x;
    }
    public static void main(String[] args) {
        // formula Fn = Fn-1+Fn-2
        int a1 = 1;
        int a2 = 1;
        System.out.print(a1 + " " + a2 + " ");
        practise obj = new practise() ;
     int sib = obj.num(1,1);

       // System.out.println( x );
        //fibbonacci series 1 1 2 3 5 8 13

    }
}
