package FrontEnd;

import javax.swing.table.AbstractTableModel;

public class jTabModel extends AbstractTableModel {
    String[] columnNames = {"Id","Nome","CPF","Celular","E-mail"};
    Object[][] datas = {    {new Integer(1), "jonas","048.623.958.81", "(85) 988820874","jonas@gmail.com"},
                            {new Integer(2), "Larissa","148.623.958.81", "(85) 988820874","Larria@gmail.com"},
                            {new Integer(3), "Ramon","548.623.958.81", "(85) 988820874","Ramon@gmail.com"},
                            {new Integer(4), "Matheus","848.623.958.81", "(85) 988820874","Matheuss@gmail.com"},
                            {new Integer(5), "Lucas","348.623.958.81", "(85) 5717585","das654asd@gmail.com"}};


    @Override
    public int getRowCount() {
        return datas.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return datas[rowIndex][columnIndex];



    }
}
