package Bangladesh_Securities_And_Exchange_Commission.Talha.Compliance_Officer.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CO_Goal_6_GenerateComplianceReportController {
    @javafx.fxml.FXML
    private TableColumn<String, String> MajorIssueTableColumn;
    @javafx.fxml.FXML
    private TextField DepartmentDataSummaryTextField;
    @javafx.fxml.FXML
    private ComboBox<String> ReportingPeriodComboBox;
    @javafx.fxml.FXML
    private TableView<String> TableView;

    @javafx.fxml.FXML
    public void GenerateReportButton(ActionEvent actionEvent) {
    }
}
