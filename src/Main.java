import maxProfit.MaxProfit;
import maxProfit.MaxProfitClass;
import peak_element.PeakElementClass;
import recursion.RecursionClass;
import searchMatrix.SearchMatrixClass;
import wordBreak.WordBreak;
import wordBreak.WordBreakClass2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        recursionSum();
    }

    static void wbc() {
        WordBreak wordBreak = new WordBreakClass2();
        String s = "sandwichandburgers";
        List<String> wordDict = new ArrayList<>();
        wordDict.add(0, "rgers");
        wordDict.add(1, "sand"); // "sand" + "wich" + "and" + "bu" + "rgers"
        wordDict.add(2, "wich");
        wordDict.add(3, "sandwich");
        wordDict.add(4, "and");
        wordDict.add(5, "bu");
        List<String> strings = wordBreak.wordBreak(s, wordDict);
        System.out.println(strings);
    }

    static void smc() {
        SearchMatrixClass searchMatrixClass = new SearchMatrixClass();
        int[][] matrix = {{1, 3, 5, 7}, {8, 10, 12, 14}, {15, 17, 19, 21},};
        int target = 17;
        boolean searched = searchMatrixClass.searchMatrix1(matrix, target);
        System.out.println(searched);
    }

    static void maxProfit() {
        MaxProfit maxProfit = new MaxProfitClass();
        int[] prices = {1604, 1323, 1132, 4343, 4674, 8756, 9665};
        int i = maxProfit.maxProfit(prices);
        System.out.println(i);
    }

    static void findPeakElement() {
        PeakElementClass peakElement = new PeakElementClass();
        int[] prices = {1, 5, 4, 2, 1, 5, 7};
        int peakElementIs = peakElement.findPeakElement(prices);
        System.out.println("prices[" + peakElementIs + "] is a peak element");
    }

    static void recursionSum() {
        RecursionClass recursionClass = new RecursionClass();
        int start = 5;
        int end = 10;
        int result = recursionClass.sum(start, end);
        int recursiveCalls = recursionClass.getRecursiveCalls();
        System.out.println("Sum: " + result);
        System.out.println("Recursive calls: " + recursiveCalls);
    }

}