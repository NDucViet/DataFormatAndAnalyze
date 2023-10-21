package XYZ.FomatData.view;

import XYZ.FomatData.controller.DataController;
import XYZ.FomatData.model.DataString;

public class Main {
    public static void main(String[] args) {
        DataController dataController = new DataController();
        System.out.println("Xin Chao Quy Khach ");
        DataString dataString = new DataString(dataController.checkInputPhone(), dataController.checkInputEmail(), dataController.checkInputDate());
        System.out.println(dataString.toString());
    }
}
