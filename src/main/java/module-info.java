module bsecstimulation.stimulation_of_bsec {
    requires javafx.controls;
    requires javafx.fxml;


    opens Bangladesh_Securities_And_Exchange_Commission to javafx.fxml;
    exports Bangladesh_Securities_And_Exchange_Commission;
}