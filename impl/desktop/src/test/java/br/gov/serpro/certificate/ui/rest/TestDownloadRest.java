/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.serpro.certificate.ui.rest;

import br.gov.frameworkdemoiselle.certificate.ui.util.Utils;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author 07721825741
 */
public class TestDownloadRest {

    private static String identifier = "1";
    private static String service = "http://10.32.180.96:8080/assinadorweb-example/rest/filemanager";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Utils utils = new Utils();
        System.out.println("br.gov.serpro.certificate.ui.rest.TestDownloadRest.main()");
        byte[] content = utils.downloadFromUrl(service.concat("/download/").concat(identifier));

        System.out.println("Content length..: " + content.length);
        utils.uploadToURL(content, service.concat("/upload/"));

    }
}
