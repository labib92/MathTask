public class Math {

    int sum;

    public void sumFunc(long n) {

        this.sum = 0;


        for (int i = 1; i <=n; i++) {
            sum = sum + i;
            System.out.print(i + " ");
            System.out.println(sum);


        }


    }
    public static void main(String[] args) {

        Math a  = new Math();

        a.sumFunc(5);

    }
}
