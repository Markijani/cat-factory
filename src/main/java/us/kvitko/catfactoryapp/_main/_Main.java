package us.kvitko.catfactoryapp._main;

import us.kvitko.catfactoryapp.controller.CatController;

public class _Main {

    public static void main(String[] args) {
        CatController catController = new CatController();
        catController.startCatService(" ");
    }
}
