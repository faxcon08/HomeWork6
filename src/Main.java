public class Main {
    ////////////////////////////////////////////////
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    ////////////////////////////////////////////////


    public static void main(String[] args) {
        System.out.println(ANSI_RED+"First Task 1.1."+ANSI_RESET);// First Task 1.1;
        for(int i = 1; i <=10; i++)
            System.out.print(i+" ");
        System.out.println();

        System.out.println(ANSI_RED+"Second Task 1.2"+ANSI_RESET);//Second Task 1.2;
        for (int i =10; i>=1;i--, System.out.print(i+" ")) ;
        System.out.println();

        System.out.println(ANSI_RED+"Third Task 1.3"+ANSI_RESET); // Third Task 1.3;
        for (int i=0; i<=17; i++)
            if(i%2==0)
                System.out.print(i+" ");
        System.out.println();

        System.out.println(ANSI_RED+"Fourth Task 1.4."+ANSI_RESET); // Fourth Task 1.4.
        for(int i =10; i>=-10;  System.out.print(i+" "), i--);
        System.out.println();

        System.out.println(ANSI_RED+"Fifth Task 2.1"+ANSI_RESET); // Fifth Task 2.1.
        for(int i = 1904; i<=2096; i++)
            if ((i%4==0 && i%100!=0) || i%400==0)
                System.out.println(i+" год является високосным");

        System.out.println(ANSI_RED+"Sixth Task 2.2"+ANSI_RESET); // Sixth Task 2.2.
        for(int i = 0, j=1;i<10;j*=2,i++){
                System.out.print(j+" ");
        }
        System.out.println();

        System.out.println(ANSI_RED+"Seventh Task 3.1"+ANSI_RESET); // Seventh Task 3.1;
        int total = 0, salary = 29_000;
        for (int i = 1; i<=12; i++){
            total+=salary;
            System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");
        }


        System.out.println(ANSI_RED+"Eighth Task 3.2"+ANSI_RESET); // EighTh Task 3.2;
        total =0;
        for (int i = 1; i<=12; i++){
            total+=total/100;
            total+=salary;
            System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");
        }

    }

}