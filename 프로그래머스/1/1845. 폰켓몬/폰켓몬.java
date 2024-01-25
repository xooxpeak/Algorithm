import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        // 총 N마리 중에서 N/2 마리 -> result가 N/2값보다 작거나 같아야함?
        // 같은 종류 = 같은 번호
        // 가장 많은 종류의 폰켓몬을 선택하는 방법
        // 같은 종류 폰켓몬을 뽑는건 빼야됨 -> 중복제거 -> Set
        
//        int max = nums.length / 2;    // 총 N마리 중에서 N/2 마리
        
        // 중복 제거된 set 생성
        HashSet<Integer> set = new HashSet<>();   
        
        // nums 순회화며 중복제거 된 원소들을 set에 추가
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        // 만약 set 길이가 N/2 마리보다 크다면 N/2 반환,
        // 만약 set 길이가 N/2 마리보다 작다면 set 길이 반환
        if(set.size() > nums.length / 2) {
            return nums.length / 2;
        } else {
            return set.size();
        }
    }
}