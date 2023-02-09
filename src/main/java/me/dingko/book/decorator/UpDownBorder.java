package me.dingko.book.decorator;

public class UpDownBorder extends Border{
    private char ch;

    public UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return makeLine(ch, display.getColumns()); //상단
        } else if (row == display.getRows() + 1) {
            return makeLine(ch, display.getColumns()); //하단
        } else {
            return display.getRowText(row);
        }
    }

    private String makeLine(char ch, int counts) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < counts; i++) {
            line.append(ch);
        }
        return line.toString();
    }
}
