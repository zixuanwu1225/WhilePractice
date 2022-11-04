public class Testing {
    public static void main(String[] args) {
        StringLoops f = new StringLoops();
        System.out.println(f.countCharacters("p","penis"
        ));
        System.out.println(f.reverseString("penis"));
        System.out.println(f.reverseString2("penis"));
        System.out.println(f.countVowels("Apples and bananas"));
        System.out.println(f.countVowels("Hello Joe"));
        System.out.println(f.countVowels("Hmm.. pssh!"));
        System.out.println(f.countVowels("I"));
        System.out.println(f.countVowels("Supercalifragilisticexpialidocious"));

    }
}
