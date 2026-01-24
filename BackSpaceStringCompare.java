import java.util.*;
public class BackSpaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        List<Character> listS = new ArrayList<>();
        List<Character> listT = new ArrayList<>();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '#'){
                if(!listS.isEmpty()){
                    listS.remove(listS.size()-1);
                }
            }else{
                listS.add(s.charAt(i));
            }
        }
        for(int i =0; i<t.length(); i++){
            if(t.charAt(i)=='#'){
                if(!listT.isEmpty()){
                    listT.remove(listT.size()-1);
                }
            }else{
                listT.add(t.charAt(i));
            }
        }
        StringBuilder sbValS = new StringBuilder();
        for(char ch : listS) sbValS.append(ch); 
        StringBuilder tbValT = new StringBuilder();
        for(char ch : listT) tbValT.append(ch); 
        return sbValS.toString().equals(tbValT.toString());
    }
}