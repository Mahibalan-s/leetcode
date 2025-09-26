class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;   // check feasibility
        int tank = 0;    // current fuel in tank
        int start = 0;   // potential starting index

        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            tank += gas[i] - cost[i];

            // if tank goes negative, we can't start from 'start'
            if (tank < 0) {
                start = i + 1; // reset start to next station
                tank = 0;      // reset tank
            }
        }

        return total >= 0 ? start : -1;
    }
}
