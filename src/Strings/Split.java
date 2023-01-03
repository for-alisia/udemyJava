package Strings;

public class Split {
    public static void main(String[] args) {
        // Let's pretend it's a data from spreadsheet as csv
        String csvLike = """
                Anna,Doe,1985,Atlanta,USA
                John,Smith,1960,London,UK
                Karolina,Krzyszek,Krakow,Poland
                """;
        String[] rows = csvLike.split("\n");
        // as a second arg we can pass limit (to limit a number of elem)
        // rest string part will be put under last array elem

        System.out.println(rows.length); // 3

        String[] firstPerson = rows[0].split(",");

        System.out.println(firstPerson[0]); // Anna
        System.out.println(firstPerson[1]); // Doe
    }
}
