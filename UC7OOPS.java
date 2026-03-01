import java.util.HashMap;
import java.util.Map;

public class UC7OOPS {

    // Static Inner Class for Character Pattern Mapping
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter Methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Centralized Pattern Storage
        Map<Character, CharacterPatternMap> patternLibrary = new HashMap<>();

        // Adding Character Patterns
        patternLibrary.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternLibrary.put('P', new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*      ",
                "*      "
        }));

        patternLibrary.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));

        String word = "OOPS";

        // Render Banner
        for (int row = 0; row < 5; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPatternMap patternObj = patternLibrary.get(ch);
                lineBuilder.append(patternObj.getPattern()[row]).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }
}