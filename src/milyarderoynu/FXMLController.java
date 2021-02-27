
package milyarderoynu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class FXMLController implements Initializable {

    @FXML
    private Label sual1;
    @FXML
    private Button ramiz1;
    @FXML
    private Button idris1;
    @FXML
    private Button ezel1;
    @FXML
    private Button polat1;
    @FXML
    private Label dogru;
    @FXML
    private Label yanlis;
    @FXML
    private ImageView arxa;
    @FXML
    private Button twoBas;
    @FXML
    private Label sual2;
    @FXML
    private Button andorra2;
    @FXML
    private Button tai2;
    @FXML
    private Button zelandiya2;
    @FXML
    private Button portuqaliya2;
public int pul=0;
    @FXML
    private Button threeBas2;
    @FXML
    private Label sual3;
    @FXML
    private Button bir3;
    @FXML
    private Button alti3;
    @FXML
    private Button uc3;
    @FXML
    private Button iki3;
    @FXML
    private Button yarisBitir;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dogru.setVisible(false);
        yanlis.setVisible(false);
        twoBas.setVisible(false);
        sual2.setVisible(false);
        andorra2.setVisible(false);
    zelandiya2.setVisible(false);
    tai2.setVisible(false);
    portuqaliya2.setVisible(false);
    threeBas2.setVisible(false);
    iki3.setVisible(false);
    uc3.setVisible(false);
    alti3.setVisible(false);
    bir3.setVisible(false);
    sual3.setVisible(false);
    yarisBitir.setVisible(false);
    }    

    @FXML
    private void ramizPr(ActionEvent event) {
    yanlis.setVisible(true);
    polat1.setVisible(false);
    ezel1.setVisible(false);
    idris1.setVisible(false);
    twoBas.setVisible(true);
    sual1.setVisible(false);
    ramiz1.setVisible(false);
    }

    @FXML
    private void idrisPr(ActionEvent event) {
    yanlis.setVisible(true);
    polat1.setVisible(false);
    ezel1.setVisible(false);
    twoBas.setVisible(true);
    sual1.setVisible(false);
    ramiz1.setVisible(false);
    idris1.setVisible(false);
    }

    @FXML
    private void ezelPr(ActionEvent event) {
    yanlis.setVisible(true);
    polat1.setVisible(false);
    twoBas.setVisible(true);
    idris1.setVisible(false);
    sual1.setVisible(false);
    ramiz1.setVisible(false);
    ezel1.setVisible(false);
    }

    @FXML
    private void polatPr(ActionEvent event) {
    dogru.setVisible(true);
    
    twoBas.setVisible(true);
    idris1.setVisible(false);
    sual1.setVisible(false);
    ramiz1.setVisible(false);
    ezel1.setVisible(false);
    polat1.setVisible(false);
    pul+=200000;
    }

    @FXML
    private void twoBasl(ActionEvent event) {
    sual2.setVisible(true);
    dogru.setVisible(false);
    yanlis.setVisible(false);
    twoBas.setVisible(false);
     andorra2.setVisible(true);
    zelandiya2.setVisible(true);
    tai2.setVisible(true);
    portuqaliya2.setVisible(true);
    }

    @FXML
    private void andorraPr(ActionEvent event) {
    yanlis.setVisible(true);
        threeBas2.setVisible(true);
        sual2.setVisible(false);
        andorra2.setVisible(false);
    zelandiya2.setVisible(false);
    tai2.setVisible(false);
    portuqaliya2.setVisible(false);
    }

    @FXML
    private void taiPr(ActionEvent event) {
    yanlis.setVisible(true);
        threeBas2.setVisible(true);
        sual2.setVisible(false);
        andorra2.setVisible(false);
    zelandiya2.setVisible(false);
    tai2.setVisible(false);
    portuqaliya2.setVisible(false);
    }

    @FXML
    private void zelandiyaPr(ActionEvent event) {
    dogru.setVisible(true);
      threeBas2.setVisible(true);
        sual2.setVisible(false);
        andorra2.setVisible(false);
    zelandiya2.setVisible(false);
    tai2.setVisible(false);
    portuqaliya2.setVisible(false);
    pul+=350000;
    }

    @FXML
    private void portPr(ActionEvent event) {
   yanlis.setVisible(true);
      threeBas2.setVisible(true);
        sual2.setVisible(false);
        andorra2.setVisible(false);
    zelandiya2.setVisible(false);
    tai2.setVisible(false);
    portuqaliya2.setVisible(false);
    }

    @FXML
    private void threebasl(ActionEvent event) {
     yanlis.setVisible(false);
     dogru.setVisible(false);
      threeBas2.setVisible(false);
        iki3.setVisible(true);
    uc3.setVisible(true);
    alti3.setVisible(true);
    bir3.setVisible(true);
    sual3.setVisible(true);
    }

    @FXML
    private void birPr(ActionEvent event) {
    yanlis.setVisible(true);
          yarisBitir.setVisible(true);  
        iki3.setVisible(false);
    uc3.setVisible(false);
    alti3.setVisible(false);
    bir3.setVisible(false);
    sual3.setVisible(false);
    
    }

    @FXML
    private void altiPr(ActionEvent event) {
     yanlis.setVisible(true);
          yarisBitir.setVisible(true);  
        iki3.setVisible(false);
    uc3.setVisible(false);
    alti3.setVisible(false);
    bir3.setVisible(false);
    sual3.setVisible(false);
    }

    @FXML
    private void ucPr(ActionEvent event) {
     dogru.setVisible(true);
          yarisBitir.setVisible(true);  
        iki3.setVisible(false);
    uc3.setVisible(false);
    alti3.setVisible(false);
    bir3.setVisible(false);
    sual3.setVisible(false);
    pul+=450000;
    }

    @FXML
    private void ikiPr(ActionEvent event) {
     yanlis.setVisible(true);
          yarisBitir.setVisible(true);  
        iki3.setVisible(false);
    uc3.setVisible(false);
    alti3.setVisible(false);
    bir3.setVisible(false);
    sual3.setVisible(false);
    }

    @FXML
    private void bitirPr(ActionEvent event) throws IOException {
     Parent root = FXMLLoader.load(getClass().getResource("FXML1.fxml"));
        Scene scene = new Scene(root);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    
}
