import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class RedAlienSorter{
    private List<RedAlien> redAliens = new ArrayList<>();

    /**
     * Adds a red alien to the list of those to sort
     * @param redAlien RedAlien to be added
     */
    public void addRedAlien(RedAlien redAlien) {
        // Implemented for you
        redAliens.add(redAlien);
    }

    /**
     * Prints the current RedAliens alphabetically A-Z using their toString method
     */
    public void printAliensAlphabeticallyAZ() {
        redAliens.sort(Comparator.comparing(RedAlien::getName));
        for(RedAlien redAlien : redAliens){
            System.out.println(redAlien);
        }
    }

    /**
     * Prints the current RedAliens reverse alphabetically Z-A using their toString method
     */
    public void printAliensAlphabeticallyZA() {
        redAliens.sort(Comparator.comparing(RedAlien::getName).reversed());
        for(RedAlien redAlien : redAliens){
            System.out.println(redAlien);
        }
    }

    /**
     * Prints the current RedAliens by fewest number of limbs to most using their toString method
     */
    public void printAliensByNumberOfLimbsAscending() {
        redAliens.sort(Comparator.comparing(RedAlien::getNumberOfLimbs));
        for(RedAlien redAlien : redAliens){
            System.out.println(redAlien);
        }
    }

    /**
     * Prints the current RedAliens by most number of limbs to fewest using their toString method
     */
    public void printAliensByNumberOfLimbsDescending() {
        redAliens.sort(Comparator.comparing(RedAlien::getNumberOfLimbs).reversed());
        for(RedAlien redAlien : redAliens){
            System.out.println(redAlien);
        }
    }

}