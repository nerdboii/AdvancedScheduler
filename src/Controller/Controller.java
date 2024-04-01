package Controller;

import Model.Model;
import View.View;

public class Controller {
    public Model model;
    public View view;
    public Controller() {
        model = new Model();
        view = new View();
    }
}
