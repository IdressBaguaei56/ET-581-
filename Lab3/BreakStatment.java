public class BreakStatment{
    public static void main(String[] args){
        for(int i = 1; i <=10; i++){
            if (i == 5){
                break;
            }
            System.out.println("i = " + i);
        }
        // arive here 
        System.out.println("This is the out of for loop");
    }
}