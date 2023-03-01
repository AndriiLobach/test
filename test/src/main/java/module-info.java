module sk.stuba.fei.uim.oop.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens sk.stuba.fei.uim.oop.test to javafx.fxml;
    exports sk.stuba.fei.uim.oop.test;
}