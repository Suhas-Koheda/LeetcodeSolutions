class Spreadsheet {
    HashMap<String,Integer>p;

    public Spreadsheet(int rows) {
        p = new HashMap<>();
    }

    public void setCell(String cell, int value) {
        p.put(cell,value);
    }

    public void resetCell(String cell) {
        p.remove(cell);
    }

    private int get(String s) {
        if (s.charAt(0) > '9') {
            return p.getOrDefault(s,0);
        } else {
            return Integer.parseInt(s);
        }
    }

    public int getValue(String formula) {
        String qsns[] = formula.substring(1).split("\\+");
        int ans = 0;
        for (String i : qsns) {
            ans += get(i);
        }
        return ans;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */