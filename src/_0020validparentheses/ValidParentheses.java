package _0020validparentheses;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ValidParentheses {
    public static Boolean valid(String s){
        int length = s.length();
        if (length < 2 || length % 2 != 0){
            return false;
        }
        List<Character> tmpList = new LinkedList<Character>();
        HashMap<Character, Character> keymap = new HashMap<Character, Character>();
        keymap.put('}', '{');
        keymap.put(']', '[');
        keymap.put(')', '(');

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                tmpList.add(s.charAt(i));
            } else if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']'){
                if (tmpList.isEmpty()){
                    return false;
                } else {
                    Character tmpChar = ((LinkedList<Character>) tmpList).pollLast();
                    if (tmpChar != keymap.get(s.charAt(i))){
                        return false;
                    }
                }
            }

        }
        return tmpList.isEmpty();
    }
}
