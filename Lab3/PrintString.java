public class PrintString{
    public static void main(String[] args){
        String text = "Hello World";
        int index = 0;
        while(index < text.length()){ // String.length(); // condition
                System.out.println(text.charAt(index));
                index = index + 1; // Index ++ // update 

        }
    }
}