import com.oracle.tools.packager.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static void main(String[] args) {
//        isHaveSpecial("我是**  98iwis13插上");
        isHaveSpecial1("223 3 #d 的 是个很__  EEE=+");
//        autoGenericCode("10011");

    }

    public static String isHaveSpecial(String str) {
        String regEx = "[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？]";
        //可以在中括号内加上任何想要替换的字符
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);//这里把想要替换的字符串传进来
        String result = m.replaceAll("").trim();
//        Log.debug("isHaveSpecial======="+result);
        System.out.println("isHaveSpecial======="+result);
        return result;
    }

    public static String isHaveSpecial1(String str){
//        String aa = "223 3 #d 的 是个很__  EEE=+";
        String temp = str.replaceAll("[^a-zA-Z0-9\\u4E00-\\u9FA5]", "");  //去除数字，英文，汉字  之外的内容
        String result = temp.replaceAll("[\\s*|\t|\r|\n]", "");  // 去除所有空格，制表符
        System.out.println("isHaveSpecial======="+result);
        return result;
    }
}
