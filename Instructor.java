
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListTest extends JFrame {
   private JList colorList;
   private Container container;

   private final String instuctorList[] = { "Mr. Jiang", "Mr. Tim", "Mr. DiJackaMo",
      "Mr. Hersh", "Mr. Steve"};

   private final instuctorList[] = { Mr. Jiang, Mr. Tim, Mr. DiJackaMo,
      Mr. Hersh, Mr. Steve };

   // set up GUI
   public ListTest()
   {
      super( "List Test" );

      // get content pane and set its layout
      container = getContentPane();
      container.setLayout( new FlowLayout() );

      // create a list with items in instructor array
      instuctorList = new JList( colorNames );
      instuctorListt.setVisibleRowCount( 5 );

      // do not allow multiple selections
      instuctorList.setSelectionMode( ListSelectionModel.SINGLE_SELECTION );

      // add a JScrollPane containing JList to content pane
      container.add( new JScrollPane( instructors ) );
      colorList.addListSelectionListener(

         new ListSelectionListener() {  // anonymous inner class

            // handle list selection events
            public void valueChanged( ListSelectionEvent event )
            {
               container.setBackground(
                  instructor[ instuctorList.getSelectedIndex() ] );
            }

         } // end anonymous inner class

      ); // end call to addListSelectionListener

      setSize( 350, 150 );
      setVisible( true );

   } // end ListTest constructor

   public static void main( String args[] )
   {
      ListTest application = new ListTest();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

}
