public class Test1 {
    public static void main(String[] args) {
        //1.����һ���ַ�����ʵ�ַ�ת��������������롰abc������ת���Ч��Ϊ��cba����
        String str = "abc";
        char[] chars = str.toCharArray();
        String fanzhuan = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            fanzhuan += chars[i];
        }
        System.out.println(fanzhuan);
    }
}


