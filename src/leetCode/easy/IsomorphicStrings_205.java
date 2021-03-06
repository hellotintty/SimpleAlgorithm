package leetCode.easy;


import java.util.Arrays;

/**
 * @author tianqi
 * @date 2018/12/10
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 *
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 *
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 *
 * 示例 1:
 *
 * 输入: s = "egg", t = "add"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * 示例 3:
 *
 * 输入: s = "paper", t = "title"
 * 输出: true
 */
public class IsomorphicStrings_205 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        boolean[] judge = new boolean[s.length()];
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        for (int i = 0;i<s.length();i++){
            if (judge[i] == false){
                char temple = b[i];
                char templea = a[i];
                for (int j = i;j<b.length;j++){
                    if (judge[j] == false){
                        if (b[j] == temple){
                            if (a[j] == templea){
                                a[j] = b[j];
                                judge[j] = true;
                                continue;
                            }else {
                                return false;
                            }
                        }else if (a[j] == templea){
                            return false;
                        }
                    }
                }
            }
        }
        return Arrays.toString(a).equals(Arrays.toString(b));
    }
    public static void main(String[] arge){
        String a = "abab";
        String b = "baba";
        System.out.println(isIsomorphic(a,b));
    }
}
