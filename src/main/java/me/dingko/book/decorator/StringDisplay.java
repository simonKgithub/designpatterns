package me.dingko.book.decorator;

public class StringDisplay extends Display {
    private String string; //표시 문자열

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return this.string.length();
    }

    @Override
    public int getRows() {
        return 1; //행 수는 1
    }

    @Override
    public String getRowText(int row) {
        if (row != 0) {
            throw new IndexOutOfBoundsException();
        }
        return this.string;
    }
}
