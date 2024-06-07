package CodingTest0607;

public class CodeTest05 {
    public static void main(String[] args) {

/*
배열안에서 특정한 데이터를 찾는 함수를 만들어보세요.
찾을 수 있으면 해당원소의 index 값을 반환하고, 찾지 못하면 -1을 반환합니다.
search(new int[] {1,2,3,4,5}, 5); ==> 4
search(new int[] {1,2,3,4,5}, 6); ==> -1
static int search(int[] nums, int target){
}
*/
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(search(arr1, 2));

    }

    static int search(int[] arr, int pick) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == pick) {
                return i;
            }
        }
        return -1;
    }
//        static int search(int[] nums, int target){
//
//            int result = -1;
//            for(int i=0; i<nums.length; i++){
//                if(nums[i] == target){
//                    result = i;
//                    break;
//                }
//            }
//            return result;
//        }
}
