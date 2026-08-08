package Bangladesh_Securities_And_Exchange_Commission.Talha.Complaint_Management_Officer.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CMO_Goal_5_GenerateComplaintReportController {
    @javafx.fxml.FXML
    private TableColumn<String, String> TopIssueTableColumn;
    @javafx.fxml.FXML
    private Label TopComplaintsLabel;
    @javafx.fxml.FXML
    private ComboBox<String> ReportingPeriodComboBox;
    @javafx.fxml.FXML
    private Label ResolutionRateLabel;
    @javafx.fxml.FXML
    private TableView<String> TableView;

    @javafx.fxml.FXML
    public void GenerateReportButton(ActionEvent actionEvent) {
    }
}
