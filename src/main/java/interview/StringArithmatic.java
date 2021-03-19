package interview;
// String input = "11-2+3";
public class StringArithmatic {

    public static void main(String[] args) {
        String input = "11-2+3";
        StringBuilder number = new StringBuilder();
        boolean positive =true, negative=false;
        int result =0;
        for(int i=0; i< input.length(); i++){
            char ch = input.charAt(i);
            if('-' == ch){
                negative = true;
            }else if('+' == ch){
                positive = true;
            }else {
                number.append(ch);
                if(((i < input.length() - 2 ) && (input.charAt(i+1) == '+' || input.charAt(i+1) == '-') || i == input.length()-1 )){
                    if(positive){
                        result+= Integer.valueOf(number.toString());
                         number = new StringBuilder();
                         positive = false;
                    }else if(negative){
                        result-= Integer.valueOf(number.toString());
                        negative = false;
                        number = new StringBuilder();
                    }
                }
            }
        }
        System.out.println("result is: "+ result);
    }
}
