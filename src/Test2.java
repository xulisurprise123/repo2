import java.util.Scanner;

public class Test2 {
    //    2.����һ���ַ�����ͳ���ַ����� Ӣ����ĸ���ո����ֺ������ַ����ֵĴ���

    /**
     * ������ĸ���ִ����ķ���
     * @param str
     * @return
     */
    public static int getCharacterCount(String str)
    {
        int charactercount=0;
        for(int i=0;i<str.length();i++){

            if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
                charactercount++;
        }
        return charactercount;
    }

    /**
     * ����ո���ִ����ķ���
     * @param str
     * @return
     */
    public static int getBlankCount(String str)
    {
        int blankcount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                blankcount++;
        }
        return blankcount;
    }

    /**
     * �������ֳ��ִ����ķ���
     * @param str
     * @return
     */
    public static int getNumCount(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>= '0'&&str.charAt(i)<='9')
                count++;
        }
        return count;

    }


    public static void main(String[] args){
        System.out.println("���������һ���ַ�����");
        Scanner sc =new Scanner(System.in);
        String input=sc.nextLine();
        sc.close();
        int charactercount=getCharacterCount(input);
        int blankcount=getBlankCount(input);
        int numbercount=getNumCount(input);
        int othercount=(input.length()-charactercount-blankcount-numbercount);
        System.out.println(
                "����һ���ַ�����ͳ���ַ����� Ӣ����ĸ���ո����ֺ������ַ����ֵĴ���"+
                "�����ַ����У�Ӣ����ĸ���ֵĴ����ǣ�"+charactercount+"\r\n"
                +"�ո���ֵĴ����ǣ�"+blankcount+"\r\n"
                +"���ֳ��ֵĴ����ǣ�"+numbercount+"\r\n"
                +"�����ַ����ֵĴ����ǣ�"+othercount

        );

    }

}
