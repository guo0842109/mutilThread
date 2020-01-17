public class TestNumber {

    public static void main(String[] args) {
        autoGenericCode1("06789");
//        autoGenericCode("10011");

    }

    /**
     * 不够位数的在前面补0，保留num的长度位数字
     *
     * @param code
     * @return
     */
    private static String autoGenericCode1(String code) {
        String result = "";
        // 保留num的位数
        // 0 代表前面补充0
        // num 代表长度为4
        // d 代表参数为正数型
        result = String.format("%08d", Integer.parseInt(code));
        System.out.println("======1======"+result);

        return result;
    }


    /**
     * 不够位数的在前面补0，保留code的长度位数字
     * @param code
     * @return
     */
    private static String autoGenericCode(String code) {
        String result = "";
        // 保留code的位数
        result = String.format("%08d", Integer.parseInt(code) + 1);
        System.out.println("======2======"+result);

        return result;
    }

}
