package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first, second, third;
        first = 1;
        second = 10;
        third = 100;
        System.out.println(first +" \n"  + second + "\n" +  third);
        int linkToFirst= first, linkToSecond= second, linkToThird= third;
        linkToFirst = 15;
        linkToSecond = 6;
        linkToThird = 4;
        System.out.println("\n" + linkToFirst +" \n" + linkToSecond + "\n" + linkToThird + "\n\n" + first +" \n"  + second + "\n" +  third);
    }
}
