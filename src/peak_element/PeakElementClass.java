package peak_element;

/**
 * PeakElementClass
 * <p>
 * Description goes here.
 * <p>
 * Created by arsendeputat on 07.06.2023.
 */
public class PeakElementClass {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
