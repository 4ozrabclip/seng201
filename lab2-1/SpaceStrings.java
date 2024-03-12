public class SpaceStrings {
    public int getStringLength(String str){
        return str.length();
    }
    public int getLetterPosition(String str, char letter){
        return str.indexOf(letter);
    }
    public String makeAllCaps(String str){
        return str.toUpperCase();
    }
    public String makeAllLower(String str){
        return str.toLowerCase();
    }
    public String makeHugeString(String str1, String str2){
        return str1 + str2;
    }
    public static void main(String[] args){
        SpaceStrings spacestrings = new SpaceStrings();
        System.out.println(spacestrings.getStringLength("starman"));
        System.out.println(spacestrings.getLetterPosition("starman", 'r'));
        System.out.println(spacestrings.makeAllCaps("starman"));
        System.out.println(spacestrings.makeAllLower("staSSSan"));
        System.out.println(spacestrings.makeHugeString("yessir","oki"));

    }
}
