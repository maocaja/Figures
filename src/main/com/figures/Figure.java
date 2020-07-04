package main.com.figures;

public final class Figure {

    public static final char CHARACTER = '*';
    public static final char WHITE_SPACE = ' ';
    public final static String LINE_BREAK = String.format("%n");

    public static String square(int size) {
        return figure(size,0,0,size,0);
    }

    public static String pyramid(int size) {
        return figure(size,size-1,-1,1,1);
    }


    public static String diamond(int size) {
        String topSidePyramid = pyramid(size);
        String lowerSidePyramid = figure(size-1,1,1,size-1,-1 ) ;
        return topSidePyramid + lowerSidePyramid;
    }

    public static String figure (int size, int numberWhiteSpaces, int increaseWhiteSpaces, int numberCharacters, int increaseCharacters){
        StringBuilder builder = new StringBuilder();
        for (int index = 1; index <= size; ++index){
            builder.append(line(WHITE_SPACE,numberWhiteSpaces))
                    .append(line(CHARACTER,numberCharacters))
                    .append(LINE_BREAK);
            numberWhiteSpaces += increaseWhiteSpaces;
            numberCharacters += increaseCharacters;
        }
        return builder.toString();
    }


    public static String line(char chr, int times){
        StringBuilder builder = new StringBuilder();
        for (int line = 1; line <= times; ++line){
            builder.append(chr);
        }
        return builder.toString();
    }
}