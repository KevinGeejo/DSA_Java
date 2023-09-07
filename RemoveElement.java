public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1,5,6,7,8};
        int val = 7;
        int newSize = removeElement(nums, val);
        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val){
                int i = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        i++;
                    }
                }
                return i;
            }
        }

