package com.grupo2;

import java.io.BufferedReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class App {
    public static void main(String[] args) throws Exception {
        try ( 
            BufferedReader reader = Files.newBufferedReader(Paths.get(System.getProperty("user.dir") + "/src/main/java/com/grupo2/Entradas/veiculoPasseio.csv"));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ) { 
            reader.readLine();
            for (CSVRecord csvRecord : csvParser) { 
                // Accessing Values by Column Index 
                String placa = csvRecord.get(0);
                String marca = csvRecord.get(1); 
                String modelo = csvRecord.get(2);
                String ano = csvRecord.get(3);
                String valor = csvRecord.get(4);
                String consumoKmLt = csvRecord.get(5);
                Integer teste = Integer.parseInt(ano);
                //todo converter valores de ano para inteiro, valor para double e consumoKmLt para inteiro

                //new VeiculoPassageiros(placa, marca, modelo, ano, valor, consumoKmLt);
            } 
    }
        Menu user = new Menu();
        user.menuInicio();
    }
}
