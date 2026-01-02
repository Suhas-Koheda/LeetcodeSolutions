// Last updated: 02/01/2026, 10:07:09
class Solution {
    fun repairCars(ranks: IntArray, cars: Int): Long {
        var start = Long.MAX_VALUE
        var end = Long.MIN_VALUE
        for (rank in ranks) {
            end = maxOf(end, rank.toLong())
            start = minOf(start, rank.toLong())
        }
        end = end * cars * cars.toLong()
        var ans = 0L
        while (start <= end) {
            val mid = start + (end - start) / 2
            if (isCarsRepaired(mid, ranks, cars)) {
                ans = mid
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
        return ans
    }

    private fun isCarsRepaired(time: Long, ranks: IntArray, carsToBeRepaired: Int): Boolean {
        var carsRepaired = 0L
        for (rank in ranks) {
            carsRepaired += Math.sqrt((time.toDouble()) / rank.toDouble()).toLong()
            if (carsRepaired >= carsToBeRepaired) return true
        }
        return false
    }
}
