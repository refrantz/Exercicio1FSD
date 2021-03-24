public class App {
    public static void main(String[] args) throws Exception {
        try ( 
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ) { 
            for (CSVRecord csvRecord : csvParser) { 
                // Accessing Values by Column Index 
                String placa = csvRecord.get(0);
                String marca = csvRecord.get(1); 
                String modelo = csvRecord.get(2);
                double preco = Double.parseDouble(csvRecord.get(3)); 
                System.out.println("Record No - " + csvRecord.getRecordNumber()); 
                System.out.println("---------------"); 
                System.out.println("Placa : " + placa); 
                System.out.println("Marca : " + marca); 
                System.out.println("Modelo : " + modelo); 
                System.out.println("Preco : " + preco); 
                System.out.println("---------------\n\n"); 
            } 
    }
        Menu user = new Menu();
        user.menuInicio();
    }
}
