import java.io.IOException;

public class MultiplicationAndDivision {
    public static String multiplicationAndDivision(int a, int b){
        String result=new String();

        String multi=String.valueOf(a*b);
        int div=a/b;
        int rem=a%b;

        result=String.format("a*b=%s , a/b=%s rem %s", multi,div, rem);
        return result;
    }
    public static void main(String[] args) throws IOException {
        multiplicationAndDivision(5,2);
    }


}
