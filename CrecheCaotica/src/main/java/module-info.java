module com.mycompany.crechecaotica {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.crechecaotica to javafx.fxml;
    exports com.mycompany.crechecaotica;
}
