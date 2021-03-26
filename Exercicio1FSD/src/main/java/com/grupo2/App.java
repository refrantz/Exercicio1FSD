package com.grupo2;

import java.io.BufferedReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
            List<Veiculo> veiculos = new ArrayList<Veiculo>();
            for (CSVRecord csvRecord : csvParser) { 
                // Accessing Values by Column Index 
                String placa = csvRecord.get(0);
                String marca = csvRecord.get(1); 
                String modelo = csvRecord.get(2);
                Integer ano = Integer.parseInt(csvRecord.get(3));
                Double valor = Double.parseDouble(csvRecord.get(4));
                Integer consumoKmLt = Integer.parseInt(csvRecord.get(5));
                //todo converter valores de ano para inteiro, valor para double e consumoKmLt para inteiro

                veiculos.add(new VeiculoPassageiros(placa, marca, modelo, ano, valor, consumoKmLt));
            } 
            System.out.println(veiculos);
    }
        Menu user = new Menu();
        user.menuInicio();
    }
}
