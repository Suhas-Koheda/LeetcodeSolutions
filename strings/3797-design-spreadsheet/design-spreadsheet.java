class Spreadsheet {
    int p[][];

    public Spreadsheet(int rows) {
        p = new int[rows][26];
    }

    public void setCell(String cell, int value) {
        int x = cell.charAt(0) - 'A';
        int y = Integer.parseInt(cell.substring(1));
        p[y-1][x] = value;
    }

    public void resetCell(String cell) {
        int x = cell.charAt(0) - 'A';
        int y = Integer.parseInt(cell.substring(1));
        p[y-1][x] = 0;
    }

    private int get(String s) {
        if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') {
            int x = s.charAt(0) - 'A';
            int y = Integer.parseInt(s.substring(1));
            return p[y-1][x];
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