package FrontEnd.Table;

import TabelaHash.Adapter;

import javax.swing.table.AbstractTableModel;

public class MyJTabModel extends AbstractTableModel{
    private String[] columnNames = {"Nome", "CPF", "Celular", "E-mail"};
    private Object[][] dados;

    public MyJTabModel(){
        dados = Adapter.getData();
    }

    public void setDados(Object[][] dados) {
        this.dados = dados;
    }

    @Override
    public int getRowCount() {
        return dados.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return dados[rowIndex][columnIndex];
    }
}
