package com.grupo2;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class App {
    public static void main(String[] args) throws Exception {
        try ( 
            Reader reader = Files.newBufferedReader(Paths.get("D:/PUCRS/3_SEMESTRE/Fundamentos_de_D.de_Software/Exercicio1Maven/consultaveiculos/src/main/java/com/grupo2/Entradas/veiculoPassageiros.csv"));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ) { 
            for (CSVRecord csvRecord : csvParser) { 
                // Accessing Values by Column Index 
                String placa = csvRecord.get(0);
                String marca = csvRecord.get(1); 
                String modelo = csvRecord.get(2);
                int ano = Integer.parseInt(csvRecord.get(3));
                double valor = Double.parseDouble(csvRecord.get(4)); 
                System.out.println("Record No - " + csvRecord.getRecordNumber()); 
                System.out.println("---------------"); 
                System.out.println("Placa : " + placa); 
                System.out.println("Marca : " + marca); 
                System.out.println("Modelo : " + modelo);
                System.out.println("Modelo : " + ano); 
                System.out.println("Preco : " + valor); 
                System.out.println("---------------\n\n"); 
            } 
    }
        Menu user = new Menu();
        user.menuInicio();
    }
}
