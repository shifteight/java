package misc;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Demonstration of how to customize rendering based on whether
 * or not the table is being printed. The last column of the table,
 * the "Passed" column, is given an extended version of TablePrintDemo1's
 * PassedColumnRenderer, which uses clearer black and white versions
 * of the check mark and x mark icons when printing, as determined by
 * calling isPaintingForPrint on the table.
 * <p>
 * Requires the following other files:
 * <ul>
 *     <li>TablePrintDemo1.java
 *     <li>passed.png
 *     <li>failed.png
 *     <li>passed-BW.png
 *     <li>failed-BW.png
 * </ul>
 *
 * @author Shannon Hickey
 */
public class TablePrintDemo2 extends TablePrintDemo1 {

    /*
     * Black and white versions of the check mark and x mark items to
     * render the "Passed" column when printing.
     */
    private static final ImageIcon passedIconBW
        = new ImageIcon(TablePrintDemo1.class.getResource("images/passed-BW.png"));
    private static final ImageIcon failedIconBW
        = new ImageIcon(TablePrintDemo1.class.getResource("images/failed-BW.png"));

    /**
     * Constructs an instance of the demo.
     */
    public TablePrintDemo2() {
        setTitle("Table Print Demo 2");
    }

    /**
     * Overridden to return our BWPassedColumnRenderer.
     */
    protected TableCellRenderer createPassedColumnRenderer() {
        return new BWPassedColumnRenderer();
    }

    /**
     * Start the application.
     */
    public static void main(final String[] args) {
        /* Schedule for the GUI to be created and shown on the EDT */
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                /* Don't want bold fonts if we end up using metal */
                UIManager.put("swing.boldMetal", false);
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                }
                new TablePrintDemo2().setVisible(true);
            }
        });
    }
    
    /**
     * A custom cell renderer that extends TablePrinteDemo1's renderer, to instead
     * use clearer black and white versions of the icons when printing.
     */
    protected static class BWPassedColumnRenderer extends PassedColumnRenderer {
            public Component getTableCellRendererComponent(JTable table,
                                                           Object value,
                                                           boolean isSelected,
                                                           boolean hasFocus,
                                                           int row,
                                                           int column) {

            super.getTableCellRendererComponent(table, value, isSelected,
                                                hasFocus, row, column);

            /* if we're currently printing, use the black and white icons */
            if (table.isPaintingForPrint()) {
                boolean status = (Boolean)value;
                setIcon(status ? passedIconBW : failedIconBW);
            } /* otherwise, the superclass (colored) icons are used */

            return this;
        }
    }
}
