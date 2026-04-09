package dsa.dataStructure.Linear.stack;
import java.util.Stack;
public class ValidParenthesis {
    static boolean isValid(String str){
        Stack<Character> stack=new Stack<>();
        for(char c: str.toCharArray()){//{,(,[,],),}
            if(c=='(' || c=='{' || c=='['){
                //Push opening braces to the stack
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(c== ')' && top!='(') return false;
                if(c== '}' && top!='{') return false;
                if(c== ']' && top!='[') return false;
            }
        }
        return stack.empty();
        //The String is a valid parenthesis if all characters are removed
        //It is invalid if there are some mismatched characters
    }
    public static void main(String[] args) {
        String s1="{([])}";
        String s2="{{[]}";
        System.out.println(s1+ "->"+(isValid(s1)?"Valid":"Invalid"));
        System.out.println(s2+ "->"+(isValid(s2)?"Valid":"Invalid"));
    }
}
