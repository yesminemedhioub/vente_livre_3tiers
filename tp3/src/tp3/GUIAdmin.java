package tp3;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GUIAdmin {

    private JFrame frame;
    private JTextField textField;
    private JTable table;
    private BookTableModel tableModel;

    /**
     * Create the application.
     * @wbp.parser.entryPoint
     */
    public GUIAdmin() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        List<String[]> bookData = new ArrayList<>();
        // Example book data
        bookData.add(new String[]{"ISBN1", "Title 1", "Author 1", "2000", "10"});
        bookData.add(new String[]{"ISBN2", "Title 2", "Author 2", "2001", "15"});
        bookData.add(new String[]{"ISBN3", "Title 3", "Author 3", "2002", "20"});
        frame = new JFrame();
        frame.setBounds(100, 100, 521, 506);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 59, 441, 281);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Search Book by author:");
        lblNewLabel.setBounds(36, 23, 163, 14);
        panel.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(209, 20, 113, 20);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Book list:");
        lblNewLabel_1.setBounds(33, 61, 88, 14);
        panel.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("search");
        btnNewButton.setBounds(332, 19, 99, 23);
        panel.add(btnNewButton);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 81, 421, 189);
        panel.add(scrollPane);

        tableModel = new BookTableModel(bookData);
        table = new JTable(tableModel);
        scrollPane.setViewportView(table);

        JLabel lblNewLabel_2 = new JLabel("Admin");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
        lblNewLabel_2.setBounds(216, 11, 114, 22);
        frame.getContentPane().add(lblNewLabel_2);

        JButton btnNewButton_1 = new JButton("add book");
        btnNewButton_1.setBounds(29, 371, 89, 23);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("delete book");
        btnNewButton_2.setBounds(128, 371, 114, 23);
        frame.getContentPane().add(btnNewButton_2);
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GUIAdmin();
        });
    }

    private class BookTableModel extends AbstractTableModel {
        private List<String[]> bookData;
        private String[] columns = {"ISBN", "Title", "Author", "Year", "Price"};

        public BookTableModel(List<String[]> bookData) {
            this.bookData = bookData;
        }

        @Override
        public int getRowCount() {
            return bookData.size();
        }

        @Override
        public int getColumnCount() {
            return columns.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return bookData.get(rowIndex)[columnIndex];
        }

        @Override
        public String getColumnName(int column) {
            return columns[column];
        }
    }
}
