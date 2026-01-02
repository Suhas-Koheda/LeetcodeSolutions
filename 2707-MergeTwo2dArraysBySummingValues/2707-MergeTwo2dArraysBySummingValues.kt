// Last updated: 02/01/2026, 10:07:06
class Solution {
    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        var i = 0
        var j = 0
        val result = mutableListOf<IntArray>()
        
        while (i < nums1.size || j < nums2.size) {
            if (i < nums1.size && (j >= nums2.size || nums1[i][0] < nums2[j][0])) {
                result.add(nums1[i])
                i++
            } else if (j < nums2.size && (i >= nums1.size || nums1[i][0] > nums2[j][0])) {
                result.add(nums2[j])
                j++
            } else if (i < nums1.size && j < nums2.size && nums1[i][0] == nums2[j][0]) {
                result.add(intArrayOf(nums1[i][0], nums1[i][1] + nums2[j][1]))
                i++
                j++
            }
        }
        return result.toTypedArray()
    }
}
