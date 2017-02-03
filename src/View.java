import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by revali on 03.02.2017.
 */
public class View {

    ViewModel vm;
    ArrayList<RadioButton> selectDest;
    ArrayList<Text> inimesedListTexts;

    TextField insDest;
    TextField insPrice;
    TextField insName;
    GridPane grid;

   // ToggleGroup g;


    public View(Stage primaryStage) {
        vm = new ViewModel();
        grid = new GridPane();

        //Sihtkohtade lisamise nupud ja tekstid
        Text txtDest = new Text("Sihtkoht");
        grid.add(txtDest, 0, 0);

        Text txtHind = new Text("Hind");
        grid.add(txtHind, 0, 1);

        insDest = new TextField();
        insDest.setPromptText("Sihtkoht");
        grid.add(insDest, 1, 0);

        insPrice = new TextField();
        insPrice.setPromptText("Hind");
        grid.add(insPrice, 1, 1);

        Button btnAddDest = new Button("Lisa sihtkoht");
        btnAddDest.setOnAction((event) -> {
            GetDest();
        });
        grid.add(btnAddDest,1,2);

        //Inimeste lisamise nupud ja tekstid
        Text txtNimi = new Text("Nimi");
        grid.add(txtNimi, 0, 3);

        insName = new TextField();
        insName.setPromptText("Nimi");
        grid.add(insName, 1, 3);

        Button btnAddInim = new Button("Lisa sõitja");
        btnAddInim.setOnAction((event) -> {
            GetPerson();
        });
        
        grid.add(btnAddInim,1,4);

        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void GetDest() {
        String dest = insDest.getText();
        int price = Integer.parseInt(insPrice.getText());
        vm.AddDest(dest, price);
        AddDestRadio();
    }

    public void GetPerson() {

    }


    public void AddDestRadio() {
        //choiceboxiga oleks pidanud tegema!!!
        for (int i = 0; i < vm.destinations.size(); i++) {


            //g = new ToggleGroup();

            String d = vm.destinations.get(i).getDestination();
            int p = vm.destinations.get(i).getPrice();

            RadioButton rBtn = new RadioButton(d+" , "+ p +" €");
            //rBtn.setToggleGroup(g);

            selectDest.add(rBtn);

            grid.add(rBtn, 0, 5 + i);
        }
    }

}
