package ChapterFive;

public class TwelveDaysOfChristmas {

    public static void daysOfChristmas() {


        for (int days = 1; days <= 12; days++) {

            switch (days) {
                case 1 -> {
                    System.out.println("On the first day of Christmas, my true love sent to me\n" +
                            "A partridge in a pear tree");
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("""
                            On the second day of Christmas, my true love sent to me
                            Two turtledoves
                            And a partridge in a pear tree""");
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("""
                            On the third day of Christmas, my true love sent to me
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree""");
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("""
                            On the fourth day of Christmas, my true love sent to me
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree""");
                    System.out.println();
                }
                case 5 -> {
                    System.out.println("""
                            On the fifth day of Christmas, my true love sent to me
                            Five gold rings (five golden rings)
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree""");
                    System.out.println();
                }
                case 6 -> {
                    System.out.println("""
                            On the sixth day of Christmas, my true love sent to me
                            Six geese a-laying
                            Five gold rings (five golden rings)
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree""");
                    System.out.println();
                }
                case 7 -> {
                    System.out.println("""
                            On the seventh day of Christmas, my true love sent to me
                            Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings (five golden rings)
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree""");
                    System.out.println();
                }
                case 8 -> {
                    System.out.println("""
                            On the eighth day of Christmas, my true love sent to me
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings (five golden rings)
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree""");
                    System.out.println();
                }
                case 9 -> {
                    System.out.println("""
                            On the ninth day of Christmas, my true love sent to me
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings (five golden rings)
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree""");
                    System.out.println();
                }
                case 10 -> {
                    System.out.println("""
                            On the tenth day of Christmas, my true love sent to me
                            Ten lords a-leaping
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings (five golden rings)
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree""");
                    System.out.println();
                }
                case 11 -> {
                    System.out.println("""
                            On the eleventh day of Christmas, my true love sent to me
                            I sent eleven pipers piping
                            Ten lords a-leaping
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings (five golden rings)
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree""");
                    System.out.println();
                }
                case 12 -> {
                    System.out.println("""
                            On the twelfth day of Christmas, my true love sent to me
                            Twelve drummers drumming
                            Eleven pipers piping
                            Ten lords a-leaping
                            Nine ladies dancing
                            Eight maids a-milking
                            Seven swans a-swimming
                            Six geese a-laying
                            Five gold rings (five golden rings)
                            Four calling birds
                            Three French hens
                            Two turtledoves
                            And a partridge in a pear tree
                            And a partridge in a pear tree !!!""");
                    System.out.println();
                }
                default -> System.out.println("Merry Christmas To You All");
            }

        }
    }

    public static void main(String[] args) {
        daysOfChristmas();
    }
}
