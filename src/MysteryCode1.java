public class MysteryCode1 {
    public static void main(String[] args) {
        //Variable initialization & message input
        String initial = "programming is easy";
        StringBuilder newString = new StringBuilder();
        String space;

        // Gets rid of spaces
        for(int i = 0; i < initial.length(); i++){
            if(!initial.substring(i, i+1).equals(" ")){
                newString.append(initial.substring(i, i + 1));
            }
        }
        initial = newString.toString();
        newString = new StringBuilder();

        // Makes every other character uppercase
        for (int i = 1; i <= initial.length(); i++) {
            space = initial.substring(i - 1, i);
            if (i % 2 == 0) {
                space = space.toUpperCase();
            } else {
                space = space.toLowerCase();
            }
            newString.append(space).append(" ");
        }
        initial = newString.toString();
        newString = new StringBuilder();

        System.out.println(initial);

        // Removes every other character until there's no characters left
        while (initial.length() > 1) {
            for (int j = 0; j < initial.length(); j+=2) {
                newString.append(initial.substring(j, j + 1));
            }
            initial = newString.toString();
            newString = new StringBuilder();
            System.out.println(initial);
        }
    }
}