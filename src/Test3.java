public class Test3 {
    //3.��ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ�������
    // ���磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���
    public static void main(String[] args) {
        System.out.println("����һ��������ˮ�ɻ���");
        int a, b, c;
        for (int sanweishu = 100; sanweishu < 1000; sanweishu++) {
            //a,b,c�ֱ��ʾ��λ����ʮλ������λ��
            a = sanweishu % 10;
            b = (sanweishu % 100) / 10;
            c = sanweishu / 100;
            if (sanweishu == (a*a*a + b*b*b + c*c*c))
                System.out.println(sanweishu);
        }
    }
}

