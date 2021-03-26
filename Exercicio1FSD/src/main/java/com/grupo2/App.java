package com.grupo2;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class App {
    public static void main(String[] args) throws Exception {
        String pathPassageiros = "/classes/com/Entradas/veiculoPassageiros.csv";
        String pathPasseio = "/classes/com/Entradas/veiculoPasseio.csv";
        String pathUtilitario = "/classes/com/Entradas/veiculoUtilitario.csv";

        try ( 
            BufferedReader reader = Files.newBufferedReader(Paths.get(System.getProperty("user.dir") + pathPassageiros));
            BufferedReader reader2 = Files.newBufferedReader(Paths.get(System.getProperty("user.dir") + pathPasseio));
            BufferedReader reader3 = Files.newBufferedReader(Paths.get(System.getProperty("user.dir") + pathUtilitario));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
            CSVParser csvParser2 = new CSVParser(reader2, CSVFormat.DEFAULT);
            CSVParser csvParser3 = new CSVParser(reader3, CSVFormat.DEFAULT);
        ) { 
            reader.readLine();
            reader2.readLine();
            reader3.readLine();
            List<Veiculo> veiculos = new ArrayList<Veiculo>();
            for (CSVRecord csvRecord : csvParser) { 
                String placa = csvRecord.get(0);
                String marca = csvRecord.get(1); 
                String modelo = csvRecord.get(2);
                Integer ano = Integer.parseInt(csvRecord.get(3));
                Double valor = Double.parseDouble(csvRecord.get(4));
                Integer nroPass = Integer.parseInt(csvRecord.get(5));

                veiculos.add(new VeiculoPassageiros(placa, marca, modelo, ano, valor, nroPass));
            } 
            for (CSVRecord csvRecord : csvParser2) { 
                String placa = csvRecord.get(0);
                String marca = csvRecord.get(1); 
                String modelo = csvRecord.get(2);
                Integer ano = Integer.parseInt(csvRecord.get(3));
                Double valor = Double.parseDouble(csvRecord.get(4));
                Integer consumoKmLt = Integer.parseInt(csvRecord.get(5));

                veiculos.add(new VeiculoPasseio(placa, marca, modelo, ano, valor, consumoKmLt));
            }
            for (CSVRecord csvRecord : csvParser3) { 
                String placa = csvRecord.get(0);
                String marca = csvRecord.get(1); 
                String modelo = csvRecord.get(2);
                Integer ano = Integer.parseInt(csvRecord.get(3));
                Double valor = Double.parseDouble(csvRecord.get(4));
                Integer capCargaTon = Integer.parseInt(csvRecord.get(5));
                Integer nroEixos = Integer.parseInt(csvRecord.get(6));

                veiculos.add(new VeiculoUtilitario(placa, marca, modelo, ano, valor, capCargaTon, nroEixos));
            }
            System.out.println(veiculos);
            Menu user = new Menu(new CatalogoVeiculos(veiculos));
            user.menuInicio();
    }
    }
}
