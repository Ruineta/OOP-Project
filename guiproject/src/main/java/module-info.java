module hust.soict.dsai {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires transitive javafx.graphics;
    requires java.base;
    requires java.desktop;

    opens hust.soict.dsai to javafx.fxml;
    exports hust.soict.dsai;

    opens hust.soict.dsai.javafx to javafx.graphics, javafx.fxml;
    exports hust.soict.dsai.javafx;

    opens hust.soict.dsai.swing to javafx.graphics, javafx.fxml;
    exports hust.soict.dsai.swing;
}
