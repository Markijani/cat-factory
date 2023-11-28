package us.kvitko.catfactoryapp.controller;

import us.kvitko.catfactoryapp.model.service.CatService;
import us.kvitko.catfactoryapp.view.ResultWriter;

public class CatController {

    private ResultWriter resultWriter = new ResultWriter();
    private CatService catService = new CatService();

    public void startCatService(String result) {
        catService.compareCat();
        resultWriter.printResult(result);
    }
}
