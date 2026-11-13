
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int c = 0;
        int i = 0;
        int j = people.length - 1;

        while(i <= j) {
            int sum = people[j];

            if(i < j && sum + people[i] <= limit) {
                sum += people[i];
                i++;
            }

            j--;
            c++;
        }

        return c;
    }
}
