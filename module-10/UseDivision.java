public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision international1 =
                new InternationalDivision("Asia Operations", 1001, "Philippines", "Filipino");
        InternationalDivision international2 =
                new InternationalDivision("Europe Operations", 1002, "Germany", "German");

        DomesticDivision domestic1 =
                new DomesticDivision("Southeast Operations", 2001, "Georgia");
        DomesticDivision domestic2 =
                new DomesticDivision("West Coast Operations", 2002, "California");

        international1.display();
        international2.display();
        domestic1.display();
        domestic2.display();
    }
}