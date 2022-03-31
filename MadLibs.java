package GraphicUserInterface;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MadLibs extends JFrame implements ActionListener {
	   private JLabel adj1Label;     // Label for adj1
	   private JLabel adj2Label;      // Label for adj2
	   private JLabel birdLabel;	//Label for bird
	   private JLabel roomLabel;	//Label for room
	   private JLabel pastVerbLabel;	//Label for past verb
	   private JLabel verbLabel;	//Label for present verb
	   private JLabel nameLabel;	//Label for name
	   private JLabel nounLabel;	//Label for noun
	   private JLabel liquidLabel;	//Label for liquid
	   private JLabel ingVerbLabel;	//Label for -ing verb
	   private JLabel bodyPartLabel;	//Label for body part
	   private JLabel pluralNounLabel;	//Label for plural noun
	   private JLabel ingVerb2Label;	//Label for -ing verb 2
	   private JLabel noun2Label;	//Label for noun 2
	   private JLabel storyLabel; //Label for the resulting story
	   private JScrollPane scrollPane;
	   
	   private JTextField adj1;  // Displays adjective 1
	   private JTextField adj2; // Displays adjective 2
	   private JTextField bird; //Displays bird
	   private JTextField room; //Displays room
	   private JTextField pastVerb; //Displays verb in past tense
	   private JTextField verb; //Displays verb
	   private JTextField name; //Displays name
	   private JTextField noun; //Displays noun
	   private JTextField liquid; //Displays liquid
	   private JTextField ingVerb; //Displays -ing verb
	   private JTextField bodyPart; //Displays body part
	   private JTextField pluralNoun; //Displays plural noun
	   private JTextField ingVerb2; //Displays second -ing verb
	   private JTextField noun2; //Displays noun
	   private JTextArea story; //Displays the story
	   private JButton runButton;   // Triggers story generation

	   /* Constructor creates GUI components and adds GUI components
	      using a GridBagLayout. */
	   MadLibs() {
	      // Used to specify GUI component layout
	      GridBagConstraints positionConst = null;

	      // Set frame's title
	      setTitle("MadLibs Story Generator");

	      // Sets all of the labels involved
	      adj1Label = new JLabel("Insert an adjective:");
	      adj2Label = new JLabel("Insert an adjective:");
	      birdLabel = new JLabel("Insert a type of bird:");
	      roomLabel = new JLabel("Insert a room in a house:");
	      pastVerbLabel = new JLabel("Insert a verb in the past tense:");
	      verbLabel = new JLabel("Insert a verb in the present tense:");
	      nameLabel = new JLabel("Insert a person's first name:");
	      nounLabel = new JLabel("Insert a noun:");
	      liquidLabel = new JLabel("Insert a liquid:");
	      ingVerbLabel = new JLabel("Insert a verb ending in -ing:");
	      bodyPartLabel = new JLabel("Insert a body part:");
	      pluralNounLabel = new JLabel("Insert a plural noun:");
	      ingVerb2Label = new JLabel("Insert a verb ending with -ing");
	      noun2Label = new JLabel("Insert a noun:");
	      storyLabel = new JLabel("Here is your finished story!");

	      //Sets all of the text fields and makes them editable
	      adj1 = new JTextField(20);
	      adj1.setEditable(true);
	      adj1.setText("adjective");
	      
	      adj2 = new JTextField(20);
	      adj2.setEditable(true);
	      adj2.setText("adjective");
	      
	      bird = new JTextField(20);
	      bird.setEditable(true);
	      bird.setText("bird");
	      
	      room = new JTextField(20);
	      room.setEditable(true);
	      room.setText("room");
	      
	      pastVerb = new JTextField(20);
	      pastVerb.setEditable(true);
	      pastVerb.setText("verb");
	      
	      verb = new JTextField(20);
	      verb.setEditable(true);
	      verb.setText("verb");
	      
	      name = new JTextField(20);
	      name.setEditable(true);
	      name.setText("name");
	      
	      noun = new JTextField(20);
	      noun.setEditable(true);
	      noun.setText("noun");
	      
	      liquid = new JTextField(20);
	      liquid.setEditable(true);
	      liquid.setText("liquid");
	      
	      ingVerb = new JTextField(20);
	      ingVerb.setEditable(true);
	      ingVerb.setText("-ing");
	      
	      bodyPart = new JTextField(20);
	      bodyPart.setEditable(true);
	      bodyPart.setText("part");
	      
	      pluralNoun = new JTextField(20);
	      pluralNoun.setEditable(true);
	      pluralNoun.setText("nouns");
	      
	      ingVerb2 = new JTextField(20);
	      ingVerb2.setEditable(true);
	      ingVerb2.setText("-ing");
	      
	      noun2 = new JTextField(20);
	      noun2.setEditable(true);
	      noun2.setText("noun");
	      
	      story = new JTextArea();
	      scrollPane = new JScrollPane(story);
	      story.setEditable(false);
	      story.setLineWrap(true);
	      story.setWrapStyleWord(true);
	      

	      // Create a "Generate story" button
	      runButton = new JButton("Generate story!");
	      
	      // Use "this" class to handle button presses
	      runButton.addActionListener(this);

	      // Use a GridBagLayout
	      setLayout(new GridBagLayout());
	      positionConst = new GridBagConstraints();

	      // Specify component's grid location
	      positionConst.gridx = 0;
	      positionConst.gridy = 0;
	      
	      // 10 pixels of padding around component
	      positionConst.insets = new Insets(5, 5, 5, 5);
	      
	      // Add component using the specified constraints
	      add(adj1Label, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 0;
	      positionConst.insets = new Insets(5, 5, 5, 5);
	      add(adj1, positionConst);

	      positionConst.gridx = 0;
	      positionConst.gridy = 1;
	      positionConst.insets = new Insets(5, 5, 5, 5);
	      add(adj2Label, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 1;
	      positionConst.insets = new Insets(5, 5, 5, 5);
	      add(adj2, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 2;
	      positionConst.insets = new Insets(5, 5, 5, 5);
	      add(birdLabel, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 2;
	      positionConst.insets = new Insets(5, 5, 5, 5);
	      add(bird, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 3;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(roomLabel, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 3;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(room, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 4;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(pastVerbLabel, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 4;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(pastVerb, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 5;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(verbLabel, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 5;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(verb, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 6;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(nameLabel, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 6;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(name, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 7;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(nounLabel, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 7;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(noun, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 8;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(liquidLabel, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 8;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(liquid, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 9;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(ingVerbLabel, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 9;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(ingVerb, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 10;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(bodyPartLabel, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 10;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(bodyPart, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 11;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(pluralNounLabel, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 11;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(pluralNoun, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 12;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(ingVerb2Label, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 12;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(ingVerb2, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 13;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(noun2Label, positionConst);

	      positionConst.gridx = 1;
	      positionConst.gridy = 13;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(noun2, positionConst);

	      positionConst.gridx = 0;
	      positionConst.gridy = 14;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(runButton, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 15;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      add(storyLabel, positionConst);
	      
	      positionConst.gridx = 0;
	      positionConst.gridy = 16;
	      positionConst.insets = new Insets(10, 10, 10, 10);
	      positionConst.fill = GridBagConstraints.HORIZONTAL;
	      positionConst.gridwidth = 3;
	      add(scrollPane, positionConst);
	   }

	   /* Method is automatically called when an event 
	      occurs (e.g, button is pressed) */
	   @Override
	   public void actionPerformed(ActionEvent event) {
	      String input1 = adj1.getText();
	      String input2 = adj2.getText();
	      String input3 = bird.getText();
	      String input4 = room.getText();
	      String input5 = pastVerb.getText();
	      String input6 = verb.getText();
	      String input7 = name.getText();
	      String input8 = noun.getText();
	      String input9 = liquid.getText();
	      String input10 = ingVerb.getText();
	      String input11 = bodyPart.getText();
	      String input12 = pluralNoun.getText();
	      String input13 = noun2.getText();

	      // Display story generated using user input
	      story.setText("It was a " + input1 + ", cold November day. I woke up to the " + input2 + " smell of " + input3 + " roasting in the " + input4 +
	    		  " downstairs. I " + input5 + " down the stairs to see if I could help" + input6 + " the dinner. My mom said, \"See if " + input7 + 
	    		  " needs a fresh " + input8 + ".\" So I carried a tray of glasses full of " + input9 + " into the " + input10 + " room. When I got there,"
	    		  		+ " I couldn't believe my " + input11 + "! There were " + input12 + " all over the " + input13 + "!");
	   }

	   /* Creates a MadLibsFrame and makes it visible */
	   public static void main(String[] args) {
	      // Creates MadLibsFrame and its components
	      MadLibs myFrame = new MadLibs();

	      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      myFrame.pack();
	      myFrame.setVisible(true);
	   }
	}