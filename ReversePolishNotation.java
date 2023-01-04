package Microsoft;

import java.util.Stack;

public class ReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){

            if(s.equals("+")){
                int n2=st.pop();
                int n1=st.pop();
                st.push(n1+n2);
            }else if(s.equals("-")){
                int n2=st.pop();
                int n1=st.pop();
                st.push(n1-n2);
            }else if(s.equals("*")){
                int n2=st.pop();
                int n1=st.pop();
                st.push(n1*n2);
            }else if(s.equals("/")){
                int n2=st.pop();
                int n1=st.pop();
                st.push(n1/n2);
            }else{

                st.push(Integer.valueOf(s));
            }

        }


        return st.pop();
    }

    public static void main(String[] args) {
         String[] tokens =new String[] {"3","1","+","3","*"};
        System.out.println(evalRPN(tokens));

    }
}
