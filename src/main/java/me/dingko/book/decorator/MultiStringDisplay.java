package me.dingko.book.decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display{
    private List<String> list = new ArrayList<>(); //표시 문자열

    public MultiStringDisplay(List<String> list) {
        this.list = list;
    }

    public MultiStringDisplay() {

    }

    @Override
    public int getColumns() {
        int cnt = Integer.MIN_VALUE;
        for (String st : list) {
            if (cnt < st.length()) {
                cnt = st.length();
            }
        }
        return cnt;
    }

    @Override
    public int getRows() {
        return this.list.size();
    }

    @Override
    public String getRowText(int row) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.list.get(row));
        for (int i = 0; i < getColumns() - this.list.get(row).length(); i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public void add(String st){
        this.list.add(st);
    }
}
