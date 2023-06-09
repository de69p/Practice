package removeElement;

/**
 * removeElement.RemoveElementClass
 * <p>
 * Description goes here.
 * <p>
 * Created by arsendeputat on 03.06.2023.
 */
public class RemoveElementClass {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}
