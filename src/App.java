
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

class App extends JFrame {

  public static void main(String[] args) {
    JFrame w = new App( "App" );
    w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    w.setSize( 800, 700 );
    w.setVisible( true );
  }

  App( String title ) {
    super( title );

    JTable table = new JTable( 8, 4 );
    JScrollPane scr = new JScrollPane( table );
    getContentPane().add( scr );

    DefaultTableColumnModel cmodel = (DefaultTableColumnModel)table.getColumnModel();
    String[] header = { "1", "2", "3", "4" };
    for( int i = 0 ; i < 4 ; i++ ){
      TableColumn col = cmodel.getColumn(i);
      col.setHeaderValue( header[i] );
    }
  }
}
