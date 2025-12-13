class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> validCoupons = new ArrayList<>();
        Set<String> validBusinessLines = new HashSet<>(Arrays.asList("electronics", "grocery", "pharmacy", "restaurant"));
        String[] order = {"electronics", "grocery", "pharmacy", "restaurant"};
        
        for (int i = 0; i < code.length; i++) {
            if (!code[i].isEmpty() && code[i].matches("[a-zA-Z0-9_]+") && validBusinessLines.contains(businessLine[i]) && isActive[i]) {
                validCoupons.add(code[i] + "," + businessLine[i]);
            }
        }

        validCoupons.sort((a, b) -> {
            String businessLineA = a.split(",")[1];
            String businessLineB = b.split(",")[1];
            int businessLineComparison = Integer.compare(Arrays.asList(order).indexOf(businessLineA), Arrays.asList(order).indexOf(businessLineB));
            if (businessLineComparison != 0) return businessLineComparison;
            return a.split(",")[0].compareTo(b.split(",")[0]);
        });

        List<String> result = new ArrayList<>();
        for (String coupon : validCoupons) {
            result.add(coupon.split(",")[0]);
        }
        
        return result;
    }
}