public class nextGreatestLetter {
    public static void main(String[] args) {
    int[] letters = {'a','b','c','d','e','x','y','z'};
    int target = 'd';
    int ans = NextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    // return the index

    //function to get the lowest number that is greater than the target number.
    static int NextGreatestLetter(int[] letters, int target){
        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            //find middle element
//            int mid = (start + end)/2;
            int mid = start + (end-start)/2;
            if(target<letters[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;

            }



        }
        return letters[start % letters.length];
    }
}
