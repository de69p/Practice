package wordBreak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * WordBreak.WordBreakClass1
 * <p>
 * Description goes here.
 * <p>
 * Created by arsendeputat on 07.06.2023.
 */
public class WordBreakClass1 implements WordBreak {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<String, List<String>> memo = new HashMap<>();
        return wordBreakHelper(s, wordDict, memo);
    }

    private List<String> wordBreakHelper(String s, List<String> wordDict, Map<String, List<String>> memo) {

        // Перевіряємо, чи маємо мемоїзований результат для даного рядка
        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        List<String> result = new ArrayList<>();

        // Якщо рядок порожній, то додаємо порожній рядок до результату
        if (s.length() == 0) {
            result.add("");
            return result;
        }

        // Проходимося по словам зі словника
        for (String word : wordDict) { // "cats", "dogs", "sand", "and"
            // Якщо рядок починається з поточного слова
            if (s.startsWith(word)) { // s починається з "dogs"
                // Рекурсивно викликаємо функцію для залишку рядка після видалення поточного слова
                List<String> subStrings = wordBreakHelper(s.substring(word.length()), wordDict, memo); // s.substring видаляє "dogs" з String s "dogsandcats" -> "andcats";
                                                                                                       // List<String> wordDict = "cats", "dogs", "sand", "and";
                                                                                                       // Map {}
                // Додаємо усі можливі комбінації поточного слова та підстрок з результату рекурсивного виклику
                for (String subString : subStrings) {
                    String optionalSpace = subString.isEmpty() ? "" : " "; //
                    result.add(word + optionalSpace + subString);
                }
            }
        }

        // Зберігаємо результат для даного рядка в мемо
        memo.put(s, result);
        return result;
    }

}
