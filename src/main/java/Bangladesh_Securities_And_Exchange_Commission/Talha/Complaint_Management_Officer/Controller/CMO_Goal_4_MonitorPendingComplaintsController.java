package Bangladesh_Securities_And_Exchange_Commission.Talha.Complaint_Management_Officer.Controller;


import Bangladesh_Securities_And_Exchange_Commission.Talha.Complaint;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CMO_Goal_4_MonitorPendingComplaintsController {
    @javafx.fxml.FXML
    private TableColumn<Complaint, String> ComplaintIDTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> ActionComboBox;
    @javafx.fxml.FXML
    private TableColumn<Complaint, String> StatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Complaint, String> CategoryTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Complaint, String> SubmissionDateTableColumn;
    @javafx.fxml.FXML
    private TableView<Complaint> TableView;

    @javafx.fxml.FXML
    public void RefreshButton(ActionEvent actionEvent) {
    }
}
