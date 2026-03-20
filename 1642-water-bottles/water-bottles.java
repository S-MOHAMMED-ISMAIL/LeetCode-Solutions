class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank = numBottles;
        int result = numBottles;
        while (drank >= numExchange) {
            int totalExchange = drank / numExchange;
            result += totalExchange;
            drank = (drank % numExchange) + totalExchange;
        }
        return result;
    }
}