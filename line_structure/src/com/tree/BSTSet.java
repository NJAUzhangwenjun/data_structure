package com.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 张文军
 * @Description: 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
 * <p>
 * 为了方便，所有26个英文字母对应摩尔斯密码表如下：
 * <p>
 * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
 * <p>
 * 返回我们可以获得所有词不同单词翻译的数量。
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/9/618:22
 */
public class BSTSet {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<String>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                builder.append(codes[word.charAt(i) - 'a']);
            }
            set.add(builder.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        BSTSet bstSet = new BSTSet();
        int i = bstSet.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        System.out.println(i);
    }

    /**
     * 给定两个数组，编写一个函数来计算它们的交集。
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
     * 输出: [2]
     * 示例 2:
     * <p>
     * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出: [9,4]
     * 说明:
     * <p>
     * 输出结果中的每个元素一定是唯一的。
     * 我们可以不考虑输出结果的顺序。
     *
     * @param nums1
     * @param nums2
     * @return
     */

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i : nums1) {
            list1.add(i);
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for (int i : nums2) {
            if (list1.contains(i)) {
                list2.add(i);
                list1.remove(Integer.valueOf(i));
            }
        }

        int[] ints = new int[list2.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = list2.get(i);
        }
        return ints;
    }

    private ListNode head = new ListNode(0);

    public void deleteNode(ListNode node) {
        ListNode header = new ListNode(0);
        header.next = head;
        ListNode cur = header;
        while (cur.next != null) {
            if (cur.next.val == node.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

    }

    /**
     * 给定一个单词，你需要判断单词的大写使用是否正确。
     * <p>
     * 我们定义，在以下情况时，单词的大写用法是正确的：
     * <p>
     * 全部字母都是大写，比如"USA"。
     * 单词中所有字母都不是大写，比如"leetcode"。
     * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
     * 否则，我们定义这个单词没有正确使用大写字母。
     * <p>
     * 示例 1:
     * <p>
     * 输入: "USA"
     * 输出: True
     * 示例 2:
     * <p>
     * 输入: "FlaG"
     * 输出: False
     *
     * @param word
     * @return
     */
    public boolean detectCapitalUse(String word) {
        Boolean isTrue = false;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) >= 65 && word.charAt(i) <= 90 && word.charAt(0) >= 65 && word.charAt(0) <= 90) {
                isTrue = true;
            } else if (word.charAt(i) < 65 && word.charAt(i) > 90 && word.charAt(0) >= 65 || word.charAt(0) <= 90) {
                isTrue = true;
            } else if (word.charAt(i) < 65 && word.charAt(i) > 90 && word.charAt(0) < 65 || word.charAt(0) > 90) {
            }
        }
        isTrue = true;
        return isTrue;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

