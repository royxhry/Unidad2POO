class MainRseta{
    public static void main(String[] args) {
        Suma sum1 = new Suma();
        sum1.setNum(65);
        sum1.setNum2(40);

        Suma sum2 = new Suma();

        sum2.setNum(86);
        sum2.setNum2(49);
        int a = sum1.getNum() - sum1.getNum2();
        int b = sum2.getNum() - sum2.getNum2();

        System.out.println(a);
        System.out.println(b);
}
}

