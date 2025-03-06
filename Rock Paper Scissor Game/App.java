import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] str){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                //instantiate a RockPaperScissorGUI obj
                RockPaperScissorUI rockPaperScissorUI = new RockPaperScissorUI();

                //display gui
                rockPaperScissorUI.setVisible(true);
            }
        });
    }
}
