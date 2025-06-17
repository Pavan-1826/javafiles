import java.util.HashSet;
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> uniqueCandyTypes = new HashSet<>();
        for (int candy : candyType) {
            uniqueCandyTypes.add(candy);
        }
        int maxCandiesToTake = candyType.length / 2;
        return Math.min(uniqueCandyTypes.size(), maxCandiesToTake);
    }
}
