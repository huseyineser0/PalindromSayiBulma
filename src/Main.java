
public class Main {
    static boolean isPolindrom(int number){
        int temp= number,reversNumber=0,lastNumber;

        while (temp!=0){
            lastNumber=temp%10;
            reversNumber=(reversNumber*10)+lastNumber;
            temp/=10;
        }
        if (number==reversNumber){
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {

        System.out.println(isPolindrom(989));
    }
}