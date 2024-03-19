package FrontEnd.Table;

import TabelaHash.Adapter;

import javax.swing.table.AbstractTableModel;

public class MyJTabModel extends AbstractTableModel{
    //Atributs.......................................................
    private String[] columnNames = {"Nome", "CPF", "Celular", "E-mail"};
    private Object[][] dados;

    //Construtor.......................................................
    public MyJTabModel(){
        //dados = Adapter.getData();

        //System.out.println("tabela start");
        //System.out.println("DADOS " + dados.length);
    }

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        dados = Adapter.getData();

        System.out.println("getRowCount");
        System.out.println("DADOS " + dados.length);

        return dados.length;
    }

    @Override
    public int getColumnCount() {
        dados = Adapter.getData();

        //System.out.println("getColumnCount");
        //System.out.println("DADOS " + dados.length);

        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        dados = Adapter.getData();
        getRowCount();

        System.out.println("getValueAt");
        System.out.println("DADOS " + dados.length);

        return dados[rowIndex][columnIndex];
    }

}
