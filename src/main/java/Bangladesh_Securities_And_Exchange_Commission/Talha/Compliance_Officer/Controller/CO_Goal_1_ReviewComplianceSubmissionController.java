package Bangladesh_Securities_And_Exchange_Commission.Talha.Compliance_Officer.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CO_Goal_1_ReviewComplianceSubmissionController {
    @javafx.fxml.FXML
    private TextField IssuerIDTextField;
    @javafx.fxml.FXML
    private TableColumn<String, String> SubmittedDocumentTableView;
    @javafx.fxml.FXML
    private ComboBox<String> ActionsComboBox;
    @javafx.fxml.FXML
    private TableView<String> TableView;

    @javafx.fxml.FXML
    public void RequestMoreInfoButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ApproveButton(ActionEvent actionEvent) {
    }
}
