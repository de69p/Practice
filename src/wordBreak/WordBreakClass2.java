package wordBreak;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * WordBreak.WordBreakClass2
 * <p>
 * Description goes here.
 * <p>
 * Created by arsendeputat on 07.06.2023.
 */
public class WordBreakClass2 implements WordBreak {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();

        for(String word: wordDict){
            set.add(word);
        }

        List<String> res = new ArrayList<>();
        if(s.length()==0) return res;

        int i=0, j=1;

        helper(s,set,i,j,res,"");
        return res;

    }


    public void helper(String s, HashSet<String> set, int i, int j, List<String> res, String temp){
        String s1=temp;
        if(i>=s.length() || j==s.length()+1){
            return;
        }

        if(set.contains(s.substring(i,j))){
            if(j==s.length()){
                temp+=s.substring(i,j);
                res.add(temp);
                return;
            }else{
                temp+=s.substring(i,j)+" ";
                helper(s,set,j,j+1,res,temp);
            }
        }
        temp=s1;
        helper(s,set,i,j+1,res,temp);


    }
}
